package day09;

import java.util.Arrays;

public class MethodQuiz1 {

    static int calcDivisor(int num){
         int total =0;

        System.out.printf("%d의 약수: ",num);
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                total+=i;
                System.out.print(i+" ");

            }
        }
        System.out.println();

        return total;
    }


    public static void main(String[] args) {

        System.out.println("10의 약수의 총합:" + calcDivisor(10));
        System.out.println("-----------------------------------------");
        System.out.println("30의 약수의 총합:" + calcDivisor(30));

    }
}
