package session02;

public class StringResolveConstantDescDemo {
    public static void main(String[] args) {
        String strA = "Don't just learn the tricks of the trade, learn the trade.";
        String strB = strA.resolveConstantDesc(null);
        System.out.println("Outcome of the code: Comparing the objects");
        System.out.println(strB.equals(strA));
        System.out.println(strB == strA);
    }
}
