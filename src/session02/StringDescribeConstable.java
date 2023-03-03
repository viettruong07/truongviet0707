package session02;

import java.util.Optional;
public class StringDescribeConstable {
    public static void main(String[] args) {
        Integer x=25;
        Optional<Integer>opt = x.describeConstable();
        System.out.println(opt);
    }
}
