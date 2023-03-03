package session03;
import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, EmployeeData> anotherstaffObj = new TreeMap<String, EmployeeData>();
        anotherstaffObj.put("101", new EmployeeData("Anna John"));
        anotherstaffObj.put("102", new EmployeeData("Harry Hacker"));
        anotherstaffObj.put("103", new EmployeeData("Joby Martin"));
        System.out.println(anotherstaffObj);
        anotherstaffObj.remove("103");
        anotherstaffObj.put("104", new EmployeeData("John Luther"));
        System.out.println(anotherstaffObj.get("104"));
        Object firstKey = anotherstaffObj.firstKey();
        System.out.println(firstKey.toString());
        System.out.println((String) anotherstaffObj.firstKey());
        System.out.println((String) (anotherstaffObj.lastKey()));
    }
}
