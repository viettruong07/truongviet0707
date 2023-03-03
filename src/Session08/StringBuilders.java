package Session08;

public class StringBuilders {
    StringBuilder str =new StringBuilder("JAVA");
    public void displayStrings(){
        System.out.println("Appended String is " + str.append("7"));
        System.out.println("Inserted String is " + str.insert(5,"SE"));
        System.out.println("Deleted String is " + str.delete(4,7));
        System.out.println("Reverse String is " + str.reverse());
    }

    public static void main(String[] args) {
        StringBuilders objStrBuild = new StringBuilders();
        objStrBuild.displayStrings();
    }
}
