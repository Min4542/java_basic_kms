package day08;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수:");
        int n = sc.nextInt(); //"숫자\n"
        sc.nextLine();

        System.out.print("문자:");
        String str = sc.nextLine(); //next line의 문제점
        System.out.println("str = " + str);

        System.out.println("입력 종료 !!!!!!!");
        sc.close();
    }
}
