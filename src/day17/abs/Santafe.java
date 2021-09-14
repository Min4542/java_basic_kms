package day17.abs;

public class Santafe extends Car{
    public Santafe(String model, int price) {
        super(model, price);
    }

    @Override
    public void start() {
        System.out.println("싼타페가 달립니다.");
    }
}
