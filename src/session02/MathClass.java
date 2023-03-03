package session02;

import java.sql.SQLOutput;

class MathClass {
    int num1,num2;
    public MathClass(){}
    public MathClass (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void doMax(){
        System.out.println("Maximum is: " + Math.max(num1,num2));
    }
    public void doMin(){
        System.out.println("Minimum is: " + Math.min(num1, num2));
    }
    public void doPow(){
        System.out.println("Result of power is: " + Math.pow(num1,num2));
    }
    public void getRandom(){
        System.out.println("Random generated is: " + Math.random());
    }
    public void doSquareRoot(){
        System.out.println("SquareRoot of" + num1 + "is: " + Math.sqrt(num1));
    }
    
}
class TestMath{
    public static void main(String[] args){
        MathClass objMath = new MathClass(4,5);
        objMath.doMax();
        objMath.doMin();
        objMath.doPow();
        objMath.getRandom();
        objMath.doSquareRoot();

    }
}
