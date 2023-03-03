package Session08;

public class Strings {
    String str = "Hello";
    Integer strLength = 5;
    public void displayStrings(){
        System.out.println("String length is: " + str.length());
        System.out.println("Character at index 2 is: " + str.charAt(2));
        System.out.println("Concatenated string is: " + str.concat("World"));
        System.out.println("String comparison is: " + str.compareTo("World"));
        System.out.println("Index of o is: " + str.indexOf("o"));
        System.out.println("Last index of 1 is: " + str.lastIndexOf("1"));
        System.out.println("Replaced string is:" +str.replace('e', 'a'));
        System.out.println("Substring is: " + str.substring(2,5));
        System.out.println("Integer to String is: " + strLength.toString());
        String str1 ="Hello";
        System.out.println("Untrimmed string is:" + str1);
        System.out.println("Trimmed string is: " + str1.trim());
    }

    public static void main(String[] args) {
        Strings objString = new Strings();
        objString.displayStrings();
    }
}
