package session03;
import java.util.*;
public class GFG4 {
    public static void main(String[] args) throws Exception {
        try {
            List<Character> list = new ArrayList<Character>();
            list.add('X');
            list.add('Y');
            System.out.println("Initial list:" + list);
            Collection<Character> immutablelist = Collections.unmodifiableCollection(list);
            System.out.println("\nTrying to modify" + "the unmodifiableCollection");
            immutablelist.add('Z');
        }
        catch (UnknownFormatConversionException e){
            System.out.println("Exception thrown:" + e);
        }
    }
}