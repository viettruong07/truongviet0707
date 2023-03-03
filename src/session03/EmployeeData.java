package session03;
import java.util.*;
class EmployeeData {
    String name; int salary;
    public EmployeeData(String nm){
        name = nm;
        salary = 5600;
    }
    public String toString(){
        return "[name=" + name + ", salary=" + salary + "]";
    }
}
class TestObject{
    public static void main(String[] args) {
        Map<String, EmployeeData> staffObj = new HashMap<String, EmployeeData>();
        staffObj.put("101", new EmployeeData("Anna John"));
        staffObj.put("102", new EmployeeData("Harry Hacker"));
        staffObj.put("103", new EmployeeData("Joby Martin"));
        System.out.println(staffObj);
        staffObj.remove("103");
        staffObj.put("106", new EmployeeData("Joby Martin"));
        System.out.println(staffObj.get("106"));
        System.out.println(staffObj);
    }
}
