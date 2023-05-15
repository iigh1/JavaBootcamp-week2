
public class Main {
    public static void main(String[] args) {

        //book

        Book b1=new Book("book1",20,"ghadeer");
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice());
        System.out.println(b1.getName());
        b1.getDiscount();

        //movie

        Movie m1=new Movie("Fun",150,"ahmad");
        System.out.println(m1.getDirector());
        System.out.println(m1.getPrice());
        System.out.println(m1.getDirector());

        m1.getDiscount();
    }
}