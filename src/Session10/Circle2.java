package Session10;

class Circle2 extends Shape2 {
    float area;
    @Override
    void calculate(float rad){
        area = getPI() * rad * rad;
        System.out.println("Area of circle is: " + area);
    }
}
