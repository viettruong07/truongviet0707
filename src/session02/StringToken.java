package session02;

import java.util.StringTokenizer;
public class StringToken {
    public void tokenizeString(String str,String delim) {
        StringTokenizer st = new StringTokenizer(str,delim);
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
class TestProject{
    public static void main(String[] args) {
        StringToken objST = new StringToken();
        objST.tokenizeString("Java,is,a,programming,language",",");
    }
}