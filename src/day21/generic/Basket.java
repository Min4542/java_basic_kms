package day21.generic;

public class Basket<F extends Fruit> { //임력할 때 Fruit를 상속받아야 한다.

    private F f;

    public void setF(F f) {
        this.f = f;
    }

    public F getF() { //제너릭 타입
        return f;
    }
}
