package arraypairsum;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/3 9:58
 * @since JKD 1.8
 */
public class Solution {

    public int arrayPairSum(int[] nums) {
        sort(nums, 0, nums.length - 1);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    private void sort(int[] nums, int low, int high) {
        if (low < high) {
            int middle = getMiddle(nums, low, high);
            sort(nums, low, middle - 1);
            sort(nums, middle + 1, high);
        }
    }

    private int getMiddle(int[] nums, int low, int high) {
        int temp = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= temp) {
                high--;
            }
            if (low < high) {
                nums[low] = nums[high];
            }
            while (low < high && nums[low] <= temp) {
                low++;
            }
            if (low < high) {
                nums[high] = nums[low];
            }
        }
        nums[low] = temp;
        return low;
    }
}
