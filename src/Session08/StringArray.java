package Session08;

public class StringArray {
    String[] empID = new String[5];
    public void createArray(){
        System.out.println("Creating Array. pLease wait...");
        for (int count = 1; count < empID.length; count++){
            empID[count] = "E00" + count;
        }
    }
    public void printArray(){
        System.out.println("the Array is: ");
        for (int count = 1; count < empID.length; count++){
            System.out.println("employee ID is: " + empID[count]);
        }
    }

    public static void main(String[] args) {
        StringArray objArray = new StringArray();
        objArray.createArray();
        objArray.printArray();
    }
}
