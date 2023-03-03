package Session04;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String day = input.nextLine();

        switch (day){
            case "Monday":
                System.out.println("First day of the week");
                break;
            case "Tuesday":
                System.out.println("Second day of the week");
                break;
            case "Wednesday":
                System.out.println("Third day of the week");
                break;
            case "Thursday":
                System.out.println("Fourth day of the week");
                break;
            case "Friday":
                System.out.println("Fifth day of the week");
                break;
            case "Saturday":
                System.out.println("Sixth day of the week");
                break;
            case " Sunday":
                System.out.println("Seventh day of the Week");
                break;
            default:
                System.out.println("invalid day");
        }
    }
}
