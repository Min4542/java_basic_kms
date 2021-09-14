package day16.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();
//        parent.m3();

        System.out.println("\n=======================\n");
        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();

        System.out.println("=========================");
        Parent c = new Child(); //부모의 탈을 쓴 자식
        System.out.println(c);
        c.m2();
        ((Child)c).m3(); //오리지날 메서드가 막혔다 이럴때 쓰는게 타입 캐스팅
        c.m2();


    }
}
