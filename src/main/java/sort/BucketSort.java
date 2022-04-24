package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public void sort(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        int bucketSize = 4;
        int d = max - min;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketSize; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int n : nums) {
            int index = (n - min) * (bucketSize - 1) / d;
            buckets.get(index).add(n);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int k = 0;
        for (int i = 0; i < bucketSize; i++) {
            for (Integer n : buckets.get(i)) {
                nums[k++] = n;
            }
        }
    }

    public static void main(String[] args) {
        ChooseSort sort = new ChooseSort();
        int[] nums = {2, 4, 1, 6, 5,8,10,23,53,42,11,3};
        sort.sort(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
