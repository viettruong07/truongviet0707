package Session11;

class Authenticate{
    Account objAcc = new Account(){
        @Override
        public void displayBalance(String accNo){
            System.out.println("Retrieving balance. please wait...");
            System.out.println("Balance of account number " + accNo.toUpperCase() + " is $40000");
        }
    };
}