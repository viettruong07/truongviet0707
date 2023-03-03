package session02;

class StringClass {
    public void manipulateStrings(String str1, String str2){
        System.out.println("Concatenated string is:" + str1.concat(str2));
        System.out.println("Substring is:" + str1.substring(0,2));
        System.out.println("Character at index 3 is:" + str1.charAt(3));
        System.out.println("UPPERCASE string form is:" + str1.toUpperCase());
        System.out.println("Length of string is:" + str1.length());
        String[] splitted = str1.split("l");
        for (int i=0; i < splitted.length; i++)
            System.out.println("Split string is:" + splitted[i]);
    }
}
class TestStringDemo{
    public static void main(String[] args) {
        StringClass objStr = new StringClass();
        objStr.manipulateStrings("Hello World!","Good morning");
    }
}
