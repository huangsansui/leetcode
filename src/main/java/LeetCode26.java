/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/9 14:34
 * @since JKD 1.8
 */
public class LeetCode26 {

    /**
     * 106ms O(n^2)
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i;
        int m = nums.length - 1;
        for (i = 0; i < m;) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                m--;
            } else {
                i++;
            }
        }
        return ++i;
    }

    /**
     * 13ms O(n)
     * @param nums
     * @return
     */
    public int removeDuplicates1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int id = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[id++] = nums[i];
            }
        }
        return id;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2};
        LeetCode26 code = new LeetCode26();
        System.out.println(code.removeDuplicates1(nums));
    }
}
