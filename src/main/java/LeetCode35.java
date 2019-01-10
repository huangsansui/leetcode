/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/10 10:54
 * @since JKD 1.8
 */
public class LeetCode35 {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        // 如果是查找等于target的元素，去掉等号
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] < target) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        LeetCode35 code = new LeetCode35();
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(code.searchInsert1(nums, 4));
    }
}
