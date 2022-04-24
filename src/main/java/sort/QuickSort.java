package sort;

public class QuickSort {

    public void sort(int[] nums) {
        if (nums.length > 0) {
            quickSort(nums, 0, nums.length - 1);
        }
    }

    private void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = getMid(nums, l, r);
            quickSort(nums, l, mid -1);
            quickSort(nums, mid + 1, r);
        }
    }

    private int getMid(int[] nums, int l, int r) {
        int tmp = nums[l];
        while (l < r) {
            while (l < r && nums[r] > tmp) {
                r--;
            }
            nums[l] = nums[r];
            while (l < r && nums[l] < tmp) {
                l++;
            }
            nums[r] = nums[l];

        }
        nums[l] = tmp;
        return l;
    }

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] nums = {2, 4, 1, 6, 5};
        sort.sort(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
