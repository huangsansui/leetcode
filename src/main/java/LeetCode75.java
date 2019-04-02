/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/2
 * @since: JDK 1.8
 */
public class LeetCode75 {

    public void sortColors(int[] nums) {
        // Solution 1 : Counting Sort
//        int red = 0;
//        int white = 0;
//        int blue = 0;
//        for (int i = 0 ; i < nums.length ; i++) {
//            int temp = nums[i];
//            if (temp == 0) {
//                red++;
//            } else if (temp == 1) {
//                white++;
//            } else if (temp == 2) {
//                blue++;
//            }
//        }
//        for (int j = 0 ; j < nums.length ; j++) {
//            if (red != 0) {
//                nums[j] = 0;
//                red--;
//            } else if (white != 0) {
//                nums[j] = 1;
//                white--;
//            } else if (blue != 0) {
//                nums[j] = 2;
//                blue--;
//            }
//        }

        // Solution 2 : Quick 3 Road
        int zero = -1;
        int two = nums.length;
        for (int i = 0 ; i < two ;) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                int temp = nums[i];
                nums[i] = nums[two];
                nums[two] = temp;
            } else if (nums[i] == 0) {
                zero++;
                int temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,0};
        LeetCode75 code = new LeetCode75();
        code.sortColors(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
