/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/14 10:34
 * @since JKD 1.8
 */
public class LeetCode121 {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profit = prices[1] - prices[0];
        int i = 0;
        while (i < prices.length) {
            for (int j = i + 1; j < prices.length; j++) {
                if (profit < prices[j] - prices[i]) {
                    profit = prices[j] - prices[i];
                }
            }
            i++;
        }
        if (profit < 0) {
            return 0;
        }
        return profit;
    }

    public static void main(String[] args) {
        LeetCode121 code = new LeetCode121();
        int[] prices = new int[]{1,2,4};
        System.out.println(code.maxProfit(prices));
    }
}
