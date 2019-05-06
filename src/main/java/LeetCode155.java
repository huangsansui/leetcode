import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created on 2019/5/6.
 *
 * @author Huangqing
 */
public class LeetCode155 {

    private Stack<Integer> stack;

    private PriorityQueue queue;

    /** initialize your data structure here. */
    public LeetCode155() {
        stack = new Stack<>();
        queue = new PriorityQueue();
    }

    public void push(int x) {
        stack.push(x);
        queue.add(x);
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new NullPointerException();
        }
        Integer pop = stack.pop();
        queue.remove(pop);
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new NullPointerException();
        }
        return stack.peek();
    }

    public int getMin() {
        if (stack.isEmpty()) {
            throw new NullPointerException();
        }
        Integer res = (Integer) queue.peek();
        return res;
    }
}
