package Session08;

public class AutoUnbox {
    public static void main(String[] args) {
        Character chBox = 'A';
        char chUnbox = chBox;
        System.out.println("Character after autoboxing is: " + chBox);
        System.out.println("Character after unboxing is: " + chUnbox);
    }
}
