package queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //enqueue
        //offer, add
        queue.offer(1);
        queue.add(2);
        //dequeue
        //remove, po11 - deQueue에 해당하는 메소드
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        //peek
        //elements, peek - peek에 해당하는 메소드
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }
}
