public class Account {

    private String id;

    private String name;
    private int balance;
    public Account(){

    }
    public Account(String id,String name) {
        this.id = id;
        this.name =name;
    }

    public Account(String id,String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        return balance-amount;
    }
    public int debit(int amount){
        return balance+amount;

    }
    public void transferTo(Account another,int amount){
        if(balance >= amount){
            this.balance -= amount;
            another.balance += amount;
        }else{
            System.out.println("The balance not enough!!");
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
