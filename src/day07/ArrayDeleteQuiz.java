package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        String[] nickName = {"영웅재중","최강창민","시아준수","믹키유천","유노윤호"};
        Scanner sc = new Scanner(System.in);
        System.out.println("*우리반 학생들의 별명:"+ Arrays.toString(nickName));
        System.out.println("-삭제할 학생의 별명을 입력하세요!");
        System.out.print(">");
        String stdNickname = sc.next();

        int idx =-1;
        for (int i = 0; i < nickName.length; i++) {
            if(stdNickname.equals(nickName)){
                idx = i;
                break;
            }
        }

        String [] temp = new String[nickName.length-1];
        if(idx != -1 ){

            for (int i = idx; i <nickName.length ; i++) {
                nickName[i]=nickName[i+1];
            }

            for (int i = 0; i < temp.length; i++) {
                nickName[i]= temp[i];
            }
            nickName=temp;
            temp=null;

        }else {
            System.out.printf("%s(은)는 존재하지 않습니다.",stdNickname);
        }

    }
}
