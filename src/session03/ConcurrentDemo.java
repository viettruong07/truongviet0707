package session03;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
public class ConcurrentDemo {
    public static void main(String[] args) {
        ConcurrentSkipListSet fruitSet = new ConcurrentSkipListSet();
        fruitSet.add("Banana");
        fruitSet.add("Peach");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Orange");
        Iterator iterator = fruitSet.iterator();
        System.out.print("In ascending order: ");
        while (iterator.hasNext())
            System.out.print(iterator.next()+"");
        System.out.println("\nIn descending order:" + fruitSet.descendingSet()+ "\n");
        System.out.println("Lower element: " + fruitSet.lower("Mango"));
        System.out.println("Higher element: " + fruitSet.higher("Apple"));
    }
}
