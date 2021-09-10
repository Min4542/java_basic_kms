
package day15.static_;

public class Calculator {

    String madeBy; //제조사
    String color; //색상
    static double pi; //원주율

    //정적 초기회자(Static initializer)
    //static 필드의 생성자 역할
    static {
        System.out.println("정적 초기화자 호충 ");
        pi = 3.14159265;
    }

    public Calculator(String madeBy, String color) {
        this.madeBy = madeBy;
        this.color = color;
        pi = 3.14159265;
    }

/*
    메서드안에서 인스턴스 필드를 사용해야 하면
    non-static으로 만들고, static필드드 */

    //계산기에 색칠하는 기능
    void paint(String color) {
        this.color = color;
    }

    //원의 넓이를 구하는 기능
    static double calcAreaCircle(int r) {
        return pi * r * r;
    }


}
