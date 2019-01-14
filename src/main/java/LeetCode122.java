/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/14 11:03
 * @since JKD 1.8
 */
public class LeetCode122 {

    public int maxProfit(int[] prices) {
        int maxPro = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxPro += prices[i + 1] - prices[i];
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        LeetCode122 code = new LeetCode122();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(code.maxProfit(prices));
    }
}
