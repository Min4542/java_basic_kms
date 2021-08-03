package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        System.out.println("#먹고 싶은 음식을 입력하세요.");
        System.out.println("#입력을 중지하려면 <그만>이라고 입력하세요.");
        String[] foods= new String[0];// 음식 이름 저장할 배열  빈배열
//        String[] foods= {};

        Scanner sc = new Scanner(System.in);
        while (true) {
            //음식명을 입력받고
            System.out.print(">");
            String food = sc.nextLine();

            if (food.equals("그만")) break;

            //공간을 확보 -> 사이즈가 기존 배열보다 1개 큰 배열을 생성
            String[] temp= new String[foods.length + 1];

            //기존의 음식들을 임시배열로 이동
            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }

            //새로운 음식을 사이즈가 큰 임시배열의 마지막 인덱스에 추가
            temp[temp.length - 1] = food;

            //원본배열로 임시배열의 주소를 이동
            foods = temp;
            temp = null;

        }//end while
        System.out.println("입력 종료 !!");
        System.out.println("먹고싶은 음식:" + Arrays.toString(foods));
        sc.close();

        //문자열끼리의 동등비교 시 ==을 사용하지 말고
        //문자열1.equals(문자열2) 를 사용할 것!
        //ex)if (s1 == s2) x
        //   if (s1.equals(s2)) o
    }
}
