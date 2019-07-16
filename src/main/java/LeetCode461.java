/**
 * 汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * link #{https://leetcode-cn.com/problems/hamming-distance/}
 * Created on 2019/7/16
 *
 * @author qing.huang
 */
public class LeetCode461 {

    public int hammingDistance(int x, int y) {
        int count = 0;
        int m, n;
        while (x != 0 && y != 0) {
            m = x % 2;
            n = y % 2;
            if (m != n) {
                count++;
            }
            x /= 2;
            y /= 2;
        }
        while (x != 0) {
            m = x % 2;
            if (m != 0) {
                count++;
            }
            x /= 2;
        }
        while (y != 0) {
            n = y % 2;
            if (n != 0) {
                count++;
            }
            y /= 2;
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode461 code = new LeetCode461();
        System.out.println(code.hammingDistance(1, 4));
    }
}
