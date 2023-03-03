package Session04;

public class GenericAcceptReturn {
    public static <E> void displayArray(E[] acceptArray){
        for (E element : acceptArray){
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArrayObj = {100 ,200 ,300 ,400 ,500};
        Double[] doubleArrayObj = {51.1, 52.2, 53.3, 54.4};
        Character[] charArrayObj = {'J', 'A', 'V','A'};
        System.out.println("Integer Array contains: ");
        displayArray(intArrayObj);
        System.out.println("\nDouble Array contains: ");
        displayArray(doubleArrayObj);
        System.out.println("\nCharacter Array contains: ");
        displayArray(charArrayObj);
    }
}
