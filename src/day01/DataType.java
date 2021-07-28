package day01;

public class DataType {
    public static void main(String[] args) {

        //정수형
        byte a = 127;
        short b =32767;
        int c = 2147483647;
        long d =2147483648L;//리터럴일 때 롱으로 넣어줘야 한다.

        //실수형
        float f1 = 3.51541544165f; //4byte
        double d1 = 3.818153416198; //8byte

        System.out.println("f1 = " + f1); //저장할수 있는 거만 표현
        System.out.println("d1 = " + d1);

        double n =0.0;
        for(int i =0;i<100; i++){
            n+= 0.1;
        }
        System.out.println("0.1을 100번 더한 결과: " + n);//어느정도 오차는 감수 해야 한다.

        //논리형
        boolean b1 = true;
        boolean b2 = false;

        //자바의 논리형은 js처럼 falsy값이 존재하지 않는다.
//        boolean b3 = 0;
//        boolean b4 =null;
//        boolean b5 = "true";
//        boolean b6 =False;
        //문자형
        //char :단일문자를 저장, 홑따옴표 사용
        char c1 = 'A';
//        char c1 = 'sds';
        //String : 문자열을 저장, 곁따옴표 사용, 기본타입 아님
        String  s1 = "sdsds";

        System.out.println("100" + "200");
        //숫자와 문자열의 덧셈은 문자열 덧셈 처리
        System.out.println(100 + "200");

//        System.out.println("200" - 100);

    }
}
