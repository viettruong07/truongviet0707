package Session05;
import java.util.zip.Deflater;
public class DeflaterApplication {
    public static void main(String[] args) throws Exception {
        String input = "The Deflater class compresses the data.";
        byte[] inputObj = input.getBytes("UTF-8");
        byte[] output = new byte[100];
        Deflater deflater = new Deflater();
        deflater.setInput(inputObj);
        deflater.finish();
        int compressDataLength = deflater.deflate(output);
        System.out.println(compressDataLength);
    }
}
