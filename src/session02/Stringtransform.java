package session02;

public class Stringtransform {
    public static void main(String[] args) {
        String str = "Life's too short";
        var result = str.transform(input->input.concat("to eat bad food")).
                transform(String::toUpperCase);
        System.out.println("String(result)");
    }
}
