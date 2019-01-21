/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/21 10:02
 * @since JKD 1.8
 */
public class LeetCode11 {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int left = height[i];
            for (int j = i + 1; j < height.length; j++) {
                int min = Math.min(left, height[j]);
                max = Math.max(max, min * (j - i));
            }
        }
        return max;
    }

    public int maxArea1(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        LeetCode11 code = new LeetCode11();
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(code.maxArea1(height));
    }
}

