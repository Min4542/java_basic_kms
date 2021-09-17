package day18.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);

        try {
            account.withDraw(50000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("잔액: "+account.getBalance());
        String x = "프로그램 종료!!";
        System.out.println(x);

        try {
            FileOutputStream fos = new FileOutputStream("D:/temp");
        } catch (FileNotFoundException e) {
            //temp폴더를 생성하는 코드
            File file = new File("D:/temp");
            file.mkdir();
        }

    }
}
