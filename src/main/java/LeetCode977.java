public class LeetCode977 {

    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1;
        int[] res = new int[nums.length];
        int index = r;
        while (l <= r) {
            if (nums[l] * nums[l] <= nums[r] * nums[r]) {
                res[index--] = nums[r] * nums[r];
                r--;
            } else {
                res[index--] = nums[l] * nums[l];
                l++;
            }
        }
        return res;
    }
}
