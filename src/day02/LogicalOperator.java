package day02;

public class LogicalOperator {
    public static void main(String[] args) {

        int x =10, y = 20;
        boolean result1 = (x != 10) && (++y == 21); //성격이 급하다 boolean값이 정해지면 뒤에 있는 항은 계산 하지 않는다.
        boolean result2 = (x == 10) || (++y == 21); //메모리 단축, 좌항애서 결정나면 끝낸다. 재껴도 된다. 그럼 쓴다.

//        boolean result1 = (x != 10) & (++y == 21);
//        boolean result2 = (x == 10) | (++y == 21);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
