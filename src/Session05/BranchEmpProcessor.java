package Session05;
import java.io.*;

class Employee implements Serializable{
    String lastName;
    String firstName;
    double sal;
}
public class BranchEmpProcessor {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        ObjectOutputStream oOut = null;
        ObjectInputStream oIn = null;
        try{
            fOut = new FileOutputStream("E:\\NewEmp.Ser");
            oOut = new ObjectOutputStream(fOut);
            Employee e = new Employee();
            e.lastName = "Smith";
            e.firstName = "John";
            e.sal = 5000.00;
            oOut.writeObject(e);
            oOut.close();
            fOut.close();
            fIn = new FileInputStream("E:\\NewEmp.Ser");
            oIn = new ObjectInputStream(fIn);
            Employee emp = (Employee) oIn.readObject();
            System.out.println("Deserialized - " + emp.firstName + " " + emp.lastName + " from NewEmployee.ser");
        } catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
