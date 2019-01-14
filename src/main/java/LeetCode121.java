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

    /**
     * Kadane's Algorithm
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int maxCur = 0;
        int maxPro = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxPro = Math.max(maxCur, maxPro);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        LeetCode121 code = new LeetCode121();
        int[] prices = new int[]{1,2,4};
        System.out.println(code.maxProfit(prices));
    }
}
