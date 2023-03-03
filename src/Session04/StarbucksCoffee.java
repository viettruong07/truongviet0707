package Session04;

import java.util.Scanner;

public class StarbucksCoffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your drink: ");
        String drink = input.nextLine();
        System.out.println("Please choose your size: ");
        String size = input.nextLine();

        switch (drink) {
            case "Float White":
                System.out.println("Float White");
                switch (size){
                    case "M":
                        System.out.println("Size M: $80");
                        break;
                    case "L":
                        System.out.println("Size L: $90");
                        break;
                    case "XL":
                        System.out.println("Size XL: $100");
                        break;
                }
                break;
            case "Coffee":
                System.out.println("Coffee");
                switch (size){
                    case "M":
                        System.out.println("Size M: $80");
                        break;
                    case "L":
                        System.out.println("Size L: $90");
                        break;
                    case "XL":
                        System.out.println("Size XL: $100");
                        break;
                }
                break;
            case "Caramel":
                System.out.println("Caramel");
                switch (size){
                    case "M":
                        System.out.println("Size M: $80");
                        break;
                    case "L":
                        System.out.println("Size L: $90");
                        break;
                    case "XL":
                        System.out.println("Size XL: $100");
                        break;
                }
                break;
            default:
                System.out.println("We don't have this!!!");

        }
    }
}
