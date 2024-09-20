package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTesting {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.offer(4);
        utility.print(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
    }
}
