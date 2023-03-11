public class Account {
    private String name;
    private int balance;

    Account(){};

    void setName(String name){
        this.name = name;
    }
    void setBalance(int n){
        this.balance = n;
    }
    String getName(){
        return this.name;
    }
    int getBalance(){
        return this.balance;
    }
}
