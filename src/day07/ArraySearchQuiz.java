package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        Scanner sc = new Scanner(System.in);
        String changeName = "";
        System.out.println("*변경 전 정보 : "+Arrays.toString(members));

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print(">");
            String memberName = sc.next();
            boolean nameHere = false;
            //순차 탐색: 탐색성공 -> 해당데이터의 인덱스 || 실패시 -> -1
            int idx = -1;
            for (int i = 0; i < members.length; i++) {
                if (memberName.equals(members[i])) {
                    idx = i;
                    nameHere = true;
                    break;
                }
            }//end for

            //수정 여부 결정
            if (nameHere) {
                System.out.printf("%s의 이름을 변경합니다.\n", members[idx]);
                members[idx] = sc.next();;
                System.out.println("변경 완료!");
                System.out.println("*변경 후 정보 :" + Arrays.toString(members));
                sc.close();
                break;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", memberName);

            }
        }// end while


    }
}
