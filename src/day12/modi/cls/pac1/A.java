package day12.modi.cls.pac1;

import day12.modi.cls.pac2.C;

//접근제한자 자리에 아무것도 안쓰면 default제한이 걸립니다.
//클래스에는 public, default제한만 사용할 수 있습니다.
 class A {

     int f1;
     int f2;

     void m1(){
        B b = new B(); // B: public
          C c = new C(); //C: public
     }


}
