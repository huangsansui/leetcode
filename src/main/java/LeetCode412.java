import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/28 13:55
 * @since JKD 1.8
 */
public class LeetCode412 {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode412 code = new LeetCode412();
        List list = code.fizzBuzz(3);
    }
}
