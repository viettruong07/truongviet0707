package session01;

import java.sql.SQLOutput;

public class Enquiry {
    public static void main(String[] args) {
        //Declaring and initializing the variables
        int accountNumber = 197834;
        double accountBalance = 11423.79;
        char accountType = 'S';
        boolean active = true;

        //Displaying the values of the variables
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Active:" + active);
        System.out.println("Account Type " + "(S: Savings C: Current): " + accountType);
        System.out.println("Account Balance: $" + accountBalance);
    }
}
