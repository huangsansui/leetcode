/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/6
 * @since: JDK 1.8
 */
public class LeetCode1 {

    /**
     * 48ms
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i + 1;j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }

    /**
     * 20ms
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] index = new int[2];
        for(int i=0;i<nums.length;i++){
            // 减少运算
            int temp = target - nums[i];
            for(int j=i + 1;j<nums.length;j++) {
                if (temp == nums[j]) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        LeetCode1 s = new LeetCode1();
        int[] nums = new int[]{2, 4, 7, 9};
        int[] target = s.twoSum(nums, 9);
        for (int n : target) {
            System.out.println(n);
        }
    }
}
