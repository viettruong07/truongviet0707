package Session05;
import java.util.stream.IntStream;
public class Tester2 {
    public static void main(String[] args) {
        IntStream.iterate(4, x -> x < 11, x -> x + 4).forEach(System.out::println);
    }
}
