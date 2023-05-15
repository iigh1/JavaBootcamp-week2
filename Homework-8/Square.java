public class Square extends Rectangle{
    private double side;
    public Square(){

    }
    public Square( double side) {

        super(side,side);
        this.side=side;
    }
    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled,side,side);
        this.side=side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+super.toString();
    }
}

