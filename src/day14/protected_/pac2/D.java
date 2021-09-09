package day14.protected_.pac2;

import day14.protected_.pac1.A;


//protected는 상속관계면 데이터를 가져갈 수 있다.
public class D extends A {

    public D(){
//        super(5);
        super("ggg");

//        super.f1 =1;
        super.f2 =5;

//        super.m1();
        super.m2();
    }


}
