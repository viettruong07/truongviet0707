package Session11;

public class Rectangle2 implements Shape2{
    private int length, width;

    public Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Rectangle2[length=" + length + ", width=" + width + "]";

    }
    @Override
    public double getArea(){
        return length * width;
    }
}
