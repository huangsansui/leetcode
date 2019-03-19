/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/24 14:25
 * @since JKD 1.8
 */
public class LeetCode371 {

    public int getSum(int a, int b) {
        int res = a;
        // 得到原位和
        int xor = a ^ b;
        // 得到进位和
        int follow = (a & b) << 1;
        // 若进位和不为0，则递归求原位和+进位和
        if (follow != 0) {
            res = getSum(xor, follow);
        } else {
            res = xor;
        }
        return res;
    }
}
