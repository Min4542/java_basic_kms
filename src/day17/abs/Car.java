package day17.abs;

public abstract class Car {

    private String model;
    private  int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }



    //주행기능
    //추상메서드
    public abstract void start(); //무엇무엇이 있어야 한다 까지만 표현하고 자세한 내용은 각자 클래스에 표현함
//    public abstract void enginBreake();


    public  void seatHeater(){
        System.out.println("시트 열선 기능을 가동합니다."); //필요할 때만 쓴다.
    }

    public final void powerHandle(){
        System.out.println("파원핸들 기능!");
    }

}
