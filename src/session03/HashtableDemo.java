package session03;
import java.util.*;
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> bookHash = new Hashtable<String, String>();
        bookHash.put("115-355N", "A Guide to Advanced Java");
        bookHash.put("116-455A", "Learn Java by Example");
        bookHash.put("116-466B", "Introduction to Solaris");
        String str = (String) bookHash.get("116-455A");
        System.out.println("Detail of book" + str);
        System.out.println("Is table empty" + bookHash.isEmpty());
        System.out.println("Does table contains key?" + bookHash.containsKey("116-466B"));
        Enumeration name = bookHash.keys();
        while (name.hasMoreElements()){
            String bkCode = (String) name.nextElement();
            System.out.println(bkCode+":" + (String)bookHash.get(bkCode));
        }
    }
}
