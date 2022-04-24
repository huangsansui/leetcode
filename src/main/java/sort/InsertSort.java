package sort;

public class InsertSort {

    public void sort(int[] nums) {
        int temp;
        int j;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            for (j = i; j > 0 && temp < nums[j - 1]; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        int[] nums = {2, 4, 1, 6, 5};
        sort.sort(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
