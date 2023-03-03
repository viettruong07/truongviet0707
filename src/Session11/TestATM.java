package Session11;

public class TestATM {
    public static void main(String[] args) {
        if (args.length == 1){
            AtmMachine objAtm = new AtmMachine();
            AtmMachine.BankDetails.printDetails();
            objAtm.displayBalance(args[0]);
        }
        else {
            System.out.println("Usage: java AtmMachine <account-no>");
        }
    }
}
