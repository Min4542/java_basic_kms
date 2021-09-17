package day20.api.lang.str;

import java.util.Locale;

public class StrEx {

    public static void main(String[] args) {

     String str = "hello java";

     //charAt(index)  = 문자열 인덱스에 따른 글자 변환
        char c = str.charAt(4);
        System.out.println("str = " + str);


        // substring() :문자열의 특정 범위 추출
        String ss2 = str.substring(6);//6번 부터 끝까지 추출
        System.out.println("ssv = " + ss2);

        String ss1 = str.substring(0,5);//0번 이상  5번 미만 추출
        System.out.println("ssv = " + ss1);

        //length(): 문자열의 총 길이 반환
        int len = str.length();
        System.out.println("len = " + len);

        //indexOf, lastIndexOf(): 특정 문자나 단어의 첫 글자 인덱스 반환
        int first = str.indexOf("l");
        int last = str.lastIndexOf("l");
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        //찾는 단어가 포함되어있다면 첫글자 인덱스, 없으면 -1 반환

        int java = str.indexOf("뽀로로");
        System.out.println("java = " + java);

        String str2 = "HELLO PORORO";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        //파일경로에서 확장자 추출
        String filePath = "C:/local/img/2021/09/17/야야야호호호.gif";
        String ext = filePath.substring(filePath.lastIndexOf(".")+1);
        System.out.println("ext = " + ext);

        switch (ext.toUpperCase()){
            case  "JPG": case "GIF": case "PNG":
                System.out.println("이미지 파일입니다.");
                break;
            default:
                System.out.println("기타 파일입니다.");
        }


        //replace(old,new): 문자열 내부에 old문자를 찾아서 new문자로 변경
        String msg = "java study, java program, java coffee";
        System.out.println(msg.replace("java","자바"));
        System.out.println(msg.replace("java",""));

        msg.replace("\n","<br>");




    }

}
