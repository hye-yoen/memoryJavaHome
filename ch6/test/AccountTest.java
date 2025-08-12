package ch6.test;
//19
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(-10000);
        System.out.println("현재잔고 : " + account.getBalance());

        account.setBalance(200000);
        System.out.println("현재잔고 : " + account.getBalance());

        account.setBalance(30000);
        System.out.println("현재잔고 : " + account.getBalance());
    }
}
