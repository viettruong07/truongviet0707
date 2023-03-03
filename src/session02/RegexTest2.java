package session02;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexTest2 {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("((X) (Y(Z)))");
        Matcher matcher1 = pattern1.matcher("((X) (Y(Z)))");
        System.out.printf("Group count is: %d\n", matcher1.groupCount());
    }
}
