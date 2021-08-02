package day05;

import java.util.Scanner;

public class LoopQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("~~~~재미있는 사칙연산 게임~~~~");
        System.out.println("#엔터를 누르면 시작합니다.");
        sc.nextLine();
        System.out.println("========================");
        int countTrue = 0;
        int countFalse = 0;

        boolean flag = false;
        int rannumLevel1 = 0;
        int rannumLevel2 = 0;
        while (!flag) {
        System.out.println("#난이도를 설정하세요!");
        System.out.println("[상, 중, 하]");
        System.out.print(">");
        String level = sc.next();



            switch (level) {
                case "상":
                    rannumLevel1 = 1000;
                    rannumLevel2 = 1000;
                    flag =true;
                    break;

                case "중":
                    rannumLevel1 = 500;
                    rannumLevel2 = 500;
                    flag =true;
                    break;

                case "하":
                    rannumLevel1 = 20;
                    rannumLevel2 = 20;
                    flag =true;
                    break;

                default:
//                    System.out.println("난이도를 잘못 설정 했습니다.난이도 상으로 자동 시작합니다.");
//                    rannumLevel1 = 1000;
//                    rannumLevel2 = 1000;
                    System.out.println("다시 입력하세요.");
                     flag = false;
            }
        }

        int qnum = 1; //문제번호수 alt+ shift+enter
        while (true) {

            int rannum1 = (int) (Math.floor(Math.random() * (rannumLevel1 - 1 + 1)) + 1);
            int rannum2 = (int) (Math.floor(Math.random() * (rannumLevel2 - 1 + 1)) + 1);



            int realResult = 0;//실제 정답

            String mark = "";//연산자 기호
            int cal = (int) (Math.floor(Math.random() * (5 - 1 + 1)) + 1);
            switch (cal) {
                case 1:
                    mark = "+";
                    realResult = rannum1 + rannum2;
                    break;
                case 2:
                    mark = "-";
                    int rn=0;
                    if(rannum1<rannum2){
                        rn=rannum1;
                        rannum1=rannum2;
                        rannum2=rn;
                    }
                    if (rannum1 < rannum2) rannum2--;
                    realResult = rannum1 - rannum2;
                    break;
                case 3:
                    mark = "*";
                    realResult = rannum1 * rannum2;
                    break;
                case 4:
                    mark = "/";
                    realResult = rannum1 / rannum2;
                    break;
                default:
                    continue;
            }



            System.out.printf("Q%d) %d %s %d\n",qnum++, rannum1, mark, rannum2);
            System.out.print(">");
            int result = sc.nextInt();


            if (result == 0) break;
            else if (result == realResult) {
                System.out.println("정답입니다!!!");
                countTrue++;
            } else if (result != realResult) {
                System.out.println("떙 틀리셨습니다!!!");
                countFalse++;
            }
            System.out.println("===============");
            continue;
        }// ctr + alt +t 감싸기
        System.out.println("브레이크!!!");
        System.out.printf("============\n");
        System.out.printf("맞은 횟수 :%d 틀린 횟수 :%d", countTrue, countFalse);
        sc.close();
    }

}
