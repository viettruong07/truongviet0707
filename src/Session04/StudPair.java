package Session04;
import java.util.*;
class StudPair<T,U> {
    private T name;
    private U rollNumber;
    public StudPair(T nmObj, U rollNo){
        this.name = nmObj;
        this.rollNumber = rollNo;
    }
    public T displayName(){
        return name;
    }
    public U displayNumber(){
        return rollNumber;
    }

    public static void main(String[] args) {
        StudPair<String, Integer> studPair = new StudPair<>("John", 2);
        System.out.println("Student Name:");
        System.out.println(studPair.displayName());
        System.out.println("Student NUmber:");
        System.out.println(studPair.displayNumber());
    }
}
