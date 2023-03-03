package Session05;

public class SumOfNumbers {
    public static void main(String[] args) {
        int num =1, sum = 0;
        do{
            sum = sum + sum;
            num++;
        } while (num <= 10);
        System.out.printf("Sum of 10 Numbers: %d\n", sum);
    }
}
