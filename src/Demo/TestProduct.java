package Demo;

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println(p1.toString());
        Product p2 = new Product(1,"iphone");
        System.out.println(p2.toString());
    }
}
