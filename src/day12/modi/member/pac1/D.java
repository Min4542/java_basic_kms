package day12.modi.member.pac1;

public class D {

    public int f1;
    int f2;
    private int f3;

    public void m1() {}
    void m2() {}
    private void m3() {}

   public D() { //alt + insert
        //생성자에 private을 붙이면 클래스에 붙이는 효가가 난다.


        f1 = 1; f2 = 2; f3 = 3;
        m1(); m2(); m3();

    }


}
