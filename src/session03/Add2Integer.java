package session03;
import java.util.Scanner;
public class Add2Integer {
    public static void main(String[] args) {
        int number1, number2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();

        sum = number1 + number2;
        System.out.println("The sum is: " + sum);
        in.close();
    }
}
