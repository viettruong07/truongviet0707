package Session05;

public class NumberPyramid {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                if (j>1){
                    System.out.println();
                    continue outer;
                }
                System.out.print(j);
            }
            System.out.println("\nThis is the outer loop.");
        }
        System.out.println("good-bye");
    }
}
