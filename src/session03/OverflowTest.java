package session03;

public class OverflowTest {
    public static void main(String[] args) {
        int i1 = 2147483647;
        System.out.println(i1+1);
        System.out.println(i1+2);
        System.out.println(i1+3);
        System.out.println(i1*2);
        System.out.println(i1*i1);

        int i2 = -2147482648;
        System.out.println(i2 - 1);
        System.out.println(i2-2);
        System.out.println(i2 * i2);
    }
}
