package session02;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SplitTest2 {
    private static final String REGEX = "\\d";
    private static final String DAYS = "Sun1Mon2Tue3Wed4Thu5Fri6Sat";

    public static void main(String[] args) {
        Pattern objP1 = Pattern.compile(REGEX);
        String[] days = objP1.split(DAYS);
        for (String s : days){
            System.out.println(s);
        }
    }
}
