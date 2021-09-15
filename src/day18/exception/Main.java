package day18.exception;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);

        try {
            account.withDraw(50000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("잔액: "+account.getBalance());
        System.out.println("프로그램 종료!!");

    }
}
