package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("aaa");
        queue.offer("ccc");
        queue.offer("bbb");
        System.out.println("Queue: ");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        LinkedList<String> stack = new LinkedList<String>();
        stack.push("aaa");
        stack.push("ccc");
        stack.push("bbb");
        System.out.println("\nStack: ");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
