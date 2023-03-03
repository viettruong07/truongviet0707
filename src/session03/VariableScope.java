package session03;

public class VariableScope {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;
        int result;
        boolean someCondition = false;
        result = someCondition ? value1 : value2;
        System.out.println(result);
    }
}
