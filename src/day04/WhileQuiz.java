package day04;

import java.util.Scanner;

public class WhileQuiz {

    public static void main(String[] args) {
        System.out.println("정수 2개를 입력하세요");
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1:");
        int num1 = sc.nextInt();
        System.out.print("정수 2:");
        int num2 = sc.nextInt();
        int total= 0;


        for (num1 = 0; num1<=num2; num1++){
            total+=num1;
        }



//        while (num1<=num2){
//            total+=num1;
//            num1++;
//
//        }

        System.out.printf("%d~%d까지의 총합:%d",num1,num2,total);

    sc.close();
    }
}
