package day20.api.lang.wrapper;

public class Wrap {

    static int x;
    static Integer y;

    public static void main(String[] args) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x =5;
        y=7;
        System.out.println(x+y);

        //이종 모음 배열 가능 wrap때문에 이거 뺴면 차이 없음
        Object[] arr = {5, 8.8, "hello"};

        int n = 100;
        Integer m = n;

        //문자열 변환기능
        String s1 = "90";
        String s2 = "5.11";

        int i = Integer.parseInt(s1);
        double v = Double.parseDouble(s2);
        System.out.println(i+v);

    }

}
