public class Account {
    private String name;
    private int balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < 0){
            this.balance = 0;
            return;
        }
        this.balance = balance;
    }
}
