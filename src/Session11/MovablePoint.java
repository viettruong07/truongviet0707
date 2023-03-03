package Session11;

public class MovablePoint implements Movable{
    private int x,y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    @Override
    public void moveUp(){
        y--;
    }
    public void moveDown(){
        y++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }
}
