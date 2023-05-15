
public class Main {
    public static void main(String[] args) {

        //Circle 1
        Circle c1=new Circle("blue",true,2.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());

        //Rectangle 1

        Rectangle r1 =new Rectangle("red",true,5,5);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.toString());


        //Square 1

        Square s1=new Square("green",true,10);
        System.out.println(s1.getColor());
        System.out.println(s1.getSide());
        System.out.println(s1.toString());



    }
}