package day03;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("너 얼마 있어?");
        int money = sc.nextInt();
        sc.close();
        String food = money >= 5000 ? "김치찌개"
                    : money >= 2500 ?"라면" : "굶어!"; //그냥 if, else if를 써라
        System.out.println("food = " + food);

    }
}
