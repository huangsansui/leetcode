/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/10 10:03
 * @since JKD 1.8
 */
public class LeetCode27 {

    public int removeElement(int[] nums, int val) {
        // Solution 1
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int rev = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[rev++] = nums[i];
            }
        }
        return rev;
    }

    public int removeElement1(int[] nums, int val) {
        int k = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] != val){
                if(k != i){
                    nums[k++] = nums[i];
                }else{
                    k++;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        LeetCode27 code = new LeetCode27();
        int[] nums = new int[]{3, 2, 2, 3};
        System.out.println(code.removeElement1(nums, 3));
    }
}
