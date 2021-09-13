package day16.poly.basic;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class Basic {

    A x1 = new A();
    B x2 = new B();

    //모든 자식객체는 부모타입으로 변환 가능
    A x3 = new B();
    A x4 = new C();

    A x5 = new D();
    A x6 = x5;

    Object x7 = new E();


    //상속관계가 없으면 타입변환 불가능
//    C x8 = new B();
//    d x9 = new E();

}
