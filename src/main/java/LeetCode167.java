import java.util.HashMap;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/1/15
 * @since: JDK 1.8
 */
public class LeetCode167 {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<numbers.length;i++) {
            if (map.containsKey(target - numbers[i])) {
                result[0] = i + 1;
                result[1] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }

    public int[] twoSum1(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] result = new int[2];
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4};
        LeetCode167 code = new LeetCode167();
        code.twoSum(nums, 6);
    }
}
