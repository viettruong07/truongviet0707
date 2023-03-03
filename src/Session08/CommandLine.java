package Session08;

public class CommandLine {
    public static void main(String[] args) {
        if (args.length==3){
            System.out.println("First Name is " + args[0]);
            System.out.println("last name is " + args[1]);
            System.out.println("Designation is " + args[2]);
        }
        else {
            System.out.println("Specify the first Name, last name, and designation");
        }
    }
}
