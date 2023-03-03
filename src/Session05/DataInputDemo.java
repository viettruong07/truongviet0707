package Session05;
import java.io.*;
public class DataInputDemo {
    public static void main(String[] args) {
        try{
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("enter a double value:");
            double d = dis.readDouble();
            System.out.print("Enter an integer value:");
        }
        catch (IOException e){}
    }
}
