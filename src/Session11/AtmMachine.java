package Session11;
import java.util.Calendar;
class AtmMachine {
    static class BankDetails{
        static Calendar objNow = Calendar.getInstance();
        public static void printDetails(){
            System.out.println("State Bank of America");
            System.out.println("Branch: New York");
            System.out.println("Code: K3983LKSIE");
            System.out.println("Date-Time: " + objNow.getTime());
        }
    }
    public void displayBalance(String accNo){
        System.out.println("Balance of account number " + accNo.toUpperCase() + "is $200000");
    }
}
