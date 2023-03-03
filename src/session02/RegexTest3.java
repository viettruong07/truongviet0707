package session02;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class RegexTest3 {
    public static void main(String[] args) {
        System.out.print("Enter expression:");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(scanner.next(),Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern.matcher("((X) (Y(Z)))");
        System.out.printf("Group count is: %d\n", matcher1.groupCount());
    }
}
