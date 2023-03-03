package BaiThi;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank(1000, 10);
        double interest = bank.calculateInterest();
        System.out.println("The interest for a balance of $1000 and a rate of 10% is: $" + interest);
    }
}
