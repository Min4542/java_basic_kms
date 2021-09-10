package day15.final_;

class Child extends Parent {

//    @Override
//    void m1() {
//        super.m1();
//    }

}

public /*final : 상속 불가 */ class Parent {

    String s;

    final void m1() {
    }  //오버라이딩 불가

    void m2() {
    }

}
