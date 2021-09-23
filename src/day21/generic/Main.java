package day21.generic;

public class Main {

    public static void main(String[] args) {

      /*  AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        System.out.println(ab.getApple()); */

        Basket<Apple> ab = new Basket<Apple>();
        ab.setF(new Apple());
        System.out.println(ab.getF());

        Basket<Banana> bb = new Basket<>(); //생성자 쪽에서 정의하면 생략 가능
        bb.setF(new Banana());
        System.out.println(bb.getF());

//        Basket<Water> wb = new Basket<>();//모순이 있다.


    }

}
