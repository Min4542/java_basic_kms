package day19.inter;

import day12.modi.member.pac1.D;

public class BullDog extends Dog implements Pet, Huntable { //상속이 먼저고 그 다음이 인터페이스

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void hunt(String target) {
        System.out.println("불독은 근육으로 사냥해여!!");
    }

    @Override
    public void play() {


    }
}
