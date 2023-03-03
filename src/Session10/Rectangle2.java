package Session10;

class Rectangle2 extends Shape2{
    float perimeter;
    float length = 10;

    @Override
    void calculate(float width){
        perimeter = 2;
        System.out.println("Perimeter of the Rectangle is: " + perimeter);
    }
}
