package day17.abs;

public class Ferrari extends Car{
    public Ferrari(String model, int price) {
        super(model, price);
    }

    @Override
    public void start(){ //강제 되었다
        System.out.println("페라리가 달립니다.");
    }

}
