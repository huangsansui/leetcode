import java.util.*;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2019/4/12
 * @since: JDK 1.8
 */
public class LeetCode347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<ElementCount> list = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            ElementCount count = new ElementCount((int)entry.getKey(), (int)entry.getValue());
            list.add(count);
        }
        PriorityQueue<ElementCount> queue = new PriorityQueue<>();
        for (ElementCount e : list) {
            if (queue.size() < k) {
                queue.add(e);
            } else {
                ElementCount element = queue.peek();
                if (e.count > element.count) {
                    queue.poll();
                    queue.add(e);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            res.add(queue.poll().num);
        }
        return res;
    }

    private static class ElementCount implements Comparable {

        private Integer num;

        private Integer count;

        public ElementCount(Integer num, Integer count) {
            this.num = num;
            this.count = count;
        }

        @Override
        public int compareTo(Object o) {
            ElementCount e1 = this;
            ElementCount e2 = (ElementCount) o;
            if (e1.count > e2.count) {
                return 1;
            } else if (e1.count < e2.count) {
                return -1;
            }
            return 0;
        }
    }
}
