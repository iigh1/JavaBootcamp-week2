
public class Main {
    public static void main(String[] args) {

//        Call Account class

        Account a1 = new Account();
        Account a2 = new Account();

        a1.setName("Sara");
        a1.setId("111");
        a1.setBalance(500);

        a2.setName("nora");
        a2.setId("112");
        a2.setBalance(1000);

        System.out.println(a1.getName());
        System.out.println(a1.getId());
        System.out.println(a1.getBalance());
        System.out.println(a1.credit(100));
        System.out.println(a1.debit(300));




        a2.transferTo(a1,50);
        System.out.println(a1);


//        ...................................
//        Call Employee class

        Employee e1 = new Employee();

        e1.setName("Samar");
        e1.setId("11133");
        e1.setSalary(7000);
        System.out.println(e1.getName());
        System.out.println(e1.getId());
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnaulSalary());
        System.out.println(e1.raisedSalary(20));
        System.out.println(e1);


    }
}

