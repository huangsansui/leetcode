import java.util.ArrayList;
import java.util.List;

public class LeetCode93 {

    private int[] segment = new int[4];

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int count = 0;
        restore(s,0, res, 0);
        return res;
    }

    private void restore(String s, int count, List<String> res, int segStart) {
        if (count == 4) {
            if (segStart == s.length()) {
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < segment.length; i++) {
                    sb.append(segment[i]);
                    if (i != 3) {
                        sb.append(".");
                    }
                }
                res.add(sb.toString());
            }
           return;
        }

        if (segStart == s.length()) {
            return;
        }

        if (s.charAt(segStart) == '0') {
            segment[count] = 0;
            restore(s, count + 1, res, segStart + 1);
        }

        int addr = 0;
        for (int segEnd = segStart; segEnd < s.length(); ++segEnd) {
            addr = addr * 10 + (s.charAt(segEnd) - '0');
            if (addr > 0 && addr <= 255) {
                segment[count] = addr;
                restore(s, count + 1, res, segEnd + 1);
            }else {
                break;
            }
        }
    }
}
