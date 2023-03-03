package Session07;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int myid = id.nextInt();

        Scanner name = new Scanner(System.in);
        String myname = name.nextLine();

        Scanner email = new Scanner(System.in);
        String myemail = email.nextLine();

        Student s1 = new Student(myid,myname,myemail);
        System.out.println(s1);

    }
}
