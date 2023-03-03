package session03;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
public class GFG {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Let's ");
        list.add("start ");
        list.add("Power ");
        list.add("Programming ");
        list.add("With ");
        list.add("Java ");
        String[] str = list.toArray(new String[0]);
        for (int i=0; i<str.length; i++){
            String data = str[i];
            System.out.print(data);
        }
    }

}
