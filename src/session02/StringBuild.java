package session02;

class StringBuild {
    StringBuilder sb = new StringBuilder();
    public void addString(String str){
        sb.append(str);
        System.out.println("Final string is:" + sb.toString());
    }
}
class TestStringBuild{
    public static void main(String[] args) {
        StringBuild sb = new StringBuild();
        sb.addString("Java is an");
        sb.addString("object-oriented ");
        sb.addString("programming ");
        sb.addString("language.");
    }
}
