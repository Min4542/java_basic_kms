package day18.exception;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withDraw (int money) throws BalanceInsufficientException{
        if (balance < money) {
            //throw: 유발하다(raise), 발생하다
            throw  new BalanceInsufficientException("잔액이 부족하다");
        }
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}
