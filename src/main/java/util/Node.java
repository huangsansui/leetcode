package util;

import java.util.List;

/**
 * Function:
 *
 * @author Huangqing
 * @date 2019/1/29 10:47
 * @since JKD 1.8
 */
public class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
