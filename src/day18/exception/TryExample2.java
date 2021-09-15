package day18.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int divResult = 0; //warning}
        try {
            System.out.println("정수1: ");
            int n1 = scanner.nextInt(); //warning

            System.out.println("정수2: ");
            int n2 = scanner.nextInt(); //warning

            divResult = n1 / n2;
        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력하세요!");
        }catch (ArithmeticException e){
            System.out.println("0으로 나누면 안됩니다.");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("divResult = " + divResult);

        scanner.close();

    }
}
