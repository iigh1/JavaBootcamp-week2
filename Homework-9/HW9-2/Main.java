
public class Main {
    public static void main(String[] args) {

        //movable

        MovablePoint m1=new MovablePoint(5,6,10,10);
        System.out.println(m1);
        m1.moveUp();
        m1.moveDown();
        m1.moveLeft();
        m1.moveRight();
    }
}