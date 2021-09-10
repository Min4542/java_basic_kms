package day15.static_;

public class Count {

    public int x; //인스턴스 필드
    public static int y; //스태틱 필드
    public static int z; //스태틱 필드



    public void m1() {
        int z = this.x + this.y;
//        m2(this);
    }

    public static void m2(Count c) {
//    static 메서드에서는 인스턴스 멤버를 직접 사용뷸가능
//    this라는 개념이 없음
//        int z = x + y;
//        c.m1();
        int z = c.x +y;
    }



}
