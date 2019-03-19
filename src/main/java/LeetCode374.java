/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/28 10:21
 * @since JKD 1.8
 */
public class LeetCode374 {

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int middle = low + (high - low) / 2 ;
            int res = guess(middle);
            if (res == -1) {
                high = middle - 1;
            } else if (res == 1) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    private int guess(int result) {
        return 0;
    }
}
