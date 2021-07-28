package day02;

public class Casting1 {
    public static void main(String[] args) {
        //묵시적 형변환(promotion, upcasting)
        byte a = 100;
        int b = a; // a가 byte타입에서 int로 승격됨.

        double c = b; //b가 int타입에서 double로 승격됨.
        System.out.println("c = " + c);

        //명시적 형변환 (downcasting) 위험
        int n = 100;
        byte m = (byte) n;
        System.out.println("m = " + m);

        double d = 500.1234;
        int i = (int)d;
        System.out.println("i = " + i);

        char r = 'A';
        int o = r;
        short p = (byte)o;
        System.out.println("p = " + p);
    }
}
