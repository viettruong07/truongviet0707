package session02;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SplitTest {
    private static final String REGEX =":";
    private static final String DAYS = "Sun:Mon:Tue:Wed:Thu:Fri:Sat";

    public static void main(String[] args) {
        Pattern objP1 = Pattern.compile(REGEX);
        String[] days = objP1.split(DAYS);
        for (String s : days) {
            System.out.println(s);
        }
    }
}
