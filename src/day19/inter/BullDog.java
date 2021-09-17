package day19.inter;


public class BullDog extends Dog implements Pet, Huntable { //상속이 먼저고 그 다음이 인터페이스


    @Override
    public void hunt(String target) {
        System.out.println("불독은 근육으로 사냥해여!!");
    }


}

