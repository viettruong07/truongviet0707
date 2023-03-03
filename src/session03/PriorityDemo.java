package session03;
import java.util.*;
public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.offer("New York");
        queue.offer("Kansas");
        queue.offer("California");
        queue.offer("Alabama");
        System.out.println("1."+ queue.poll());
        System.out.println("2."+ queue.poll());
        System.out.println("3."+ queue.peek());
        System.out.println("4."+ queue.peek());
        System.out.println("5."+ queue.remove());
        System.out.println("6."+ queue.remove());
        System.out.println("7."+ queue.peek());
        System.out.println("8."+ queue.element());
    }
}
