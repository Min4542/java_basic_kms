package day13.encap;

import day12.modi.member.pac1.D;

public class main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.engineStart();

        myCar.accelerator();
        myCar.accelerator();
        myCar.accelerator();
        myCar.accelerator();


//        myCar.speed = 300;

        myCar.slowdown();
        myCar.slowdown();
        myCar.slowdown();
        myCar.slowdown();

        System.out.println("현재 속도:" + myCar.getSpeed());

        System.out.println("===================================");

//        myCar.mode ='D';
        myCar.setMode('D');

    }
}
