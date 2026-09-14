package OOP_Tasks;

public class Bank_Accaunt {
    private double balance;
    private String account_number;
    private String owner_name;

    public Bank_Accaunt( String acc_num, String owner) {
        this.account_number = acc_num;
        this.owner_name = owner;
        this.balance = 0.0;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if (amount>=balance)
            balance -= amount;
        else System.out.println("yetarlik pulingiz yoq ");
    }
}
