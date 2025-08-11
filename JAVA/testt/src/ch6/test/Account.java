package ch6.test;
//19
public class Account {
    public static final int MIN_BALANCE =0 ;
    public static final int MAX_BALANCE = 1000000;
    private int balace;

    public int getBalance(){
        return balace;
    }

    public void setBalance(int balace){
        if(balace<Account.MIN_BALANCE || balace>Account.MAX_BALANCE){
            return;
        }
        this.balace = balace;
    }
}
