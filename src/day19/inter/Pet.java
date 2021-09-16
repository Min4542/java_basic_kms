package day19.inter;

public interface Pet {

    //필드도 못만든다 상수만 가능 기본이 상수로 저장됨
    // int a;
    int aa = 10;


    //추상 메서드
    //인터페이스는 기본이 추상메서드다
    void play();

    default void eat() {  //일반 함수처럼 할 수 도 있다 : default

    }

}
