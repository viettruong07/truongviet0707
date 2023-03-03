package session03;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Object> vecObj = new Vector<Object>();
        vecObj.addElement(new Integer(5));
        vecObj.addElement(new Integer(7));
        vecObj.addElement(new Integer(45));
        vecObj.addElement(new Float(9.95));
        vecObj.addElement(new Float(6.085));
        System.out.println("The fourth value is: " + (Object)vecObj.elementAt(3));
    }
}
