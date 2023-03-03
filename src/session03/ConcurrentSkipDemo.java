package session03;
import java.util.concurrent.ConcurrentSkipListMap;
public class ConcurrentSkipDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap fruits = new ConcurrentSkipListMap();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Mango");
        fruits.put(4, "Orange");
        fruits.put(5, "Peach");
        System.out.println("First data: " + fruits.firstEntry()+ "\n");
        System.out.println("Last data: " + fruits.lastEntry()+ "\n");
        System.out.println("Data in reverse order: " + fruits.descendingMap());
    }
}
