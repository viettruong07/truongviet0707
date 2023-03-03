package session03;
import java.util.*;
import java.io.*;
public class GFG2 {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        while (sc.hasNext()){
            String i = sc.nextLine();
            list.add(i);
        }
        String[] str = list.toArray(new String[0]);
        for (int i = 0; i < str.length; i++){
            String data = str[i];
            System.out.print(data);
        }
    }
}
