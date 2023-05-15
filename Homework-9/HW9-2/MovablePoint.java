public class MovablePoint implements Movable{

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println(y -= ySpeed);
    }

    @Override
    public void moveDown() {
        System.out.println(y += ySpeed);

    }

    @Override
    public void moveLeft() {

        System.out.println(x -= xSpeed);

    }

    @Override
    public void moveRight() {
        System.out.println(x += xSpeed);

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
