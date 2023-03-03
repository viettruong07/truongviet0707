package Session06;

public class Ball {
    private double x, y, xStep, yStep;

    public Ball(double x, double y, double xStep, double yStep) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getxStep() {
        return xStep;
    }

    public void setxStep(double xStep) {
        this.xStep = xStep;
    }

    public double getyStep() {
        return yStep;
    }

    public void setyStep(double yStep) {
        this.yStep = yStep;
    }

    public String toString(){
        return "Ball@(" + x + "," + y + "),speed = (" + xStep + "," + yStep +")";
    }
    public double[] getXY(){
        double[] results = new double[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double[] getXYStep(){
        double[] results = new double[2];
        results[0] = this.xStep;
        results[1] = this.yStep;
        return results;
    }
    public void setXYStep(double xStep, double yStep){
        this.xStep = xStep;
        this.yStep = yStep;
    }
    public Ball move(){
        x += xStep;
        y += yStep;
        return this;
    }
}
