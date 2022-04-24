package sort;

public class MergeSort {

    public void sort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
        return nums;
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int[] res = new int[high - low + 1];
        int k = 0;
        int i = low;
        int j = mid + 1;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                res[k++] = nums[i++];
            } else {
                res[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            res[k++] = nums[i++];
        }
        while (j <= high) {
            res[k++] = nums[j++];
        }
        for (int z = 0; z < k; z++) {
            nums[z + low] = res[z];
        }
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
