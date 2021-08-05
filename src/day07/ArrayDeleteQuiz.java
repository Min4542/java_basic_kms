package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        String[] nickName = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        Scanner sc = new Scanner(System.in);
        System.out.println("*우리반 학생들의 별명:" + Arrays.toString(nickName));

        while (true) {
            System.out.println("-삭제할 학생의 별명을 입력하세요!");
            System.out.print(">");
            String stdNickname = sc.next();

            //삭제 대상 인덱스
            int idx = -1;
            //인덱스의 유무
            boolean nicknameHere = false;
            //인덱스 판단 알고리즘
            for (int i = 0; i < nickName.length; i++) {
                if (stdNickname.equals(nickName[i])) {
                    idx = i;
                    nicknameHere = true;
                    //                System.out.println("있다.");
                    break;
                }
            }

            //임시 저장 배열
            String[] temp = new String[nickName.length - 1];

            if (nicknameHere) {

                //삭제 알고리즘
                for (int i = idx; i < nickName.length - 1; i++) {
                    nickName[i] = nickName[i + 1];
                }

                //pop
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = nickName[i];
                }
                nickName = temp;
                temp = null;
                System.out.println("변경 후 멤버:" + Arrays.toString(nickName));
                sc.close();
                break;
            } else {
                System.out.printf("%s(은)는 존재하지 않습니다.\n", stdNickname);
            }
        }

    }
}
