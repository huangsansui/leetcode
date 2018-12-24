package dominant;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/24
 * @since: JDK 1.8
 */
public class SolutionOne {

    public int dominantIndex(int[] nums) {
        int no1Num = 0;
        int no2Num = 0;
        int no1Index = 0;
        // 复杂度 O(n)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > no1Num) {
                no2Num = no1Num;
                no1Num = nums[i];
                no1Index = i;
            } else if (nums[i] > no2Num) {
                no2Num = nums[i];
            }
        }
        if (no1Num >= no2Num << 1) {
            return no1Index;
        }
        return -1;
    }
}
