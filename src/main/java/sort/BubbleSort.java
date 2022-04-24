package sort;

/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/24 12:09
 */
public class BubbleSort {

    public void sort(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            boolean cancel = true;
            for (int j = 1; j <= i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    cancel = false;
                }
            }
            if (cancel) {
                break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] nums = {2, 4, 1, 6, 5};
        sort.sort(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
