package sort;

/**
 * TODO
 *
 * @author huangqing
 * @date 2022/4/24 12:24
 */
public class ChooseSort {

    public void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                }
            }
        }
    }

    public static void main(String[] args) {
        ChooseSort sort = new ChooseSort();
        int[] nums = {2, 4, 1, 6, 5};
        sort.sort(nums);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
