package Session05;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class FilterOutPutApplication {
    public static void main(String[] args) throws Exception {
        OutputStream OutputStreamObj = null;
        FilterOutputStream filterOutputStreamObj = null;
        FileInputStream filterInputStreamObj = null;
        byte [] bufObj ={81,82,83,84,85};
        int i = 0;
        char c;
        try{
            OutputStreamObj = new FileOutputStream("C:/Java/test.txt");
            filterOutputStreamObj = new FilterOutputStream(OutputStreamObj);
            filterOutputStreamObj.write(bufObj);
            filterOutputStreamObj.flush();
            filterInputStreamObj = new FileInputStream("C:/Java/test.txt");
            while((i = filterInputStreamObj.read()) !=-1){
                c = (char)i;
                System.out.println("Character read after conversion is:" + c);
            }
        }catch (IOException e){
            System.out.print("Close() is invoked prior to write()");
        }
        finally {
            if (OutputStreamObj != null)
                OutputStreamObj.close();
            if (filterOutputStreamObj != null)
                filterOutputStreamObj.close();
        }
    }
}
