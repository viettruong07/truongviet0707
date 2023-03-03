package session03;
import java.util.*;
public class GFG3 {
    public static void main(String[] args) throws Exception {
        try{
            List<Character> list = new ArrayList<Character>();
            list.add('X');
            list.add('Y');
            System.out.println("Initial list:" + list);
            Collection<Character> immutablelist = Collections.unmodifiableCollection(list);
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception thrown:" + e);
        }
    }
}
