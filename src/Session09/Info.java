package Session09;

import Session09.Person2;

public class Info extends Person2 {
    private int marks;
    private double updateMarks;

    public Info(int ID, String Name, int Marks,double UpdateMarks){
        id = ID;
        name = Name;
        marks = Marks;
        updateMarks = UpdateMarks;
    }
    public void showStudent(){
        System.out.println("Id is :" +id);
        System.out.println("Name is:" + name);
        System.out.println("Marks is:" + marks);
        System.out.println("Update Marks:" + updateMarks);
    }
}