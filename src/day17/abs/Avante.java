package day17.abs;

public class Avante extends Car {

    public Avante(String model, int price) {
        super(model, price);
    }

    @Override
    public void start(){
        System.out.println("아반떼가 달립니다.");
    }

    @Override
    public void seatHeater() {
        super.seatHeater();
    }
}
