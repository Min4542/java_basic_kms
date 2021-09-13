package day16.poly.overloading;

import day12.modi.cls.pac1.B;

public class Basic {


    //add라고 쓰고 인트는 두개
    int add(int n1, int n2) {
        System.out.println("두개짜리 실행");
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        System.out.println("3개 짜리 실행에");
        return n1 + n2 + n3;
    }

    // add(int int)라서 실행이 안된다 add(int String)
    int add(int x, String y) {
        return 0;
    }

    void add(String m, int n) {

    }

    void add() {

    }
    //load : 쌓다.

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.add(35, 3, 4);
//        basic.addThree(1,24,54);

        System.out.println();
    }

}
