package session02;

public class TestGC {
    int num1;
    int num2;

    public void setNum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void showNum(){
        System.out.println("Value of num1 is" + num1);
        System.out.println("value of num2 is" + num2);
    }

    public static void main(String[] args) {
        TestGC obj1 = new TestGC();
        TestGC obj2 = new TestGC();
        obj1.setNum(2,3);
        obj2.setNum(4,5);
        obj1.showNum();
        obj2.showNum();
        //TestGC obj3; //line1
        //obj3 = obj2; //line2
        //obj3.showNum(); //line3
        //obj2 = null; //line4
        //obj3.showNum(); //line5
        //obj3 = null; //line6
        //obj3.showNum(); //line7
    }
}
