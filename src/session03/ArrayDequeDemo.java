package session03;
import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque arrDeque = new ArrayDeque();
        arrDeque.addLast("Mango");
        arrDeque.addLast("Apple");
        arrDeque.addFirst("Banana");
        for (Iterator iter = arrDeque.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
        for (Iterator descendingIter = arrDeque.descendingIterator();
        descendingIter.hasNext();){
            System.out.println(descendingIter.next());
        }
        System.out.println("First Element:"+ arrDeque.getFirst());
        System.out.println("Last Element:"+ arrDeque.getLast());
        System.out.println("Contains\"Apple\":" + arrDeque.contains("Apple"));
    }
}
