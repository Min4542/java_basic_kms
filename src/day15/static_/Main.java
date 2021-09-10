package day15.static_;

public class Main {
    public static void main(String[] args) {


        Count c1 = new Count();
        c1.x = 5;
        Count.y = 10;

        Count c2 = new Count();
        c2.x++;
        Count.y++;


        System.out.println("c2 = " + c2.x);
        System.out.println("c1 = " + c1.x);
        System.out.println("===========================");
        System.out.println("c1 = " + Count.y);
        System.out.println("c2 = " + Count.y);

        Count c3 = new Count();
        Count.y += 40;

        System.out.println("c3 = " + c3.y);

        c1.m1();
        c2.m1();

        Count.m2(c3);

//        Calculator sharp = new Calculator("샤프","파랑");
//        sharp.paint("빨강");

        double result = Calculator.calcAreaCircle(5);
        System.out.println("result = " + result);

        Calculator.calcAreaCircle(4);


    }
}
