package twosum;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/3 10:28
 * @since JKD 1.8
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int[] index = new int[2];
        while (low < high) {
            if (target < numbers[low] + numbers[high]) {
                high--;
            }
            if (target > numbers[low] + numbers[high]) {
                low++;
            }
            if (target == numbers[low] + numbers[high]) {
                index[0] = ++low;
                index[1] = ++high;
                return index;
            }
        }
        return index;
    }
}
