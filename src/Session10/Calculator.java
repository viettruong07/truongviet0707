package Session10;

public class Calculator {
    public static void main(String[] args) {
        Shape2 objShape;
        String shape;

        if (args.length == 2){
            shape = args[0].toLowerCase();
            switch (shape){
                case "circle": objShape = new Circle2();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
                case "rectangle": objShape = new Rectangle2();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
            }
        }
        else {
            System.out.println("Usage: java Calculator <shape-name> <value>");
        }
    }
}
