package day19.inter;

public class Tiger implements Huntable,Violent{

    @Override
    public void hunt(String target) {
        System.out.println("호랑이는 앞발로 사냥한다!!!");
    }

    @Override
    public void attack() {
        System.out.println("폭력적이야!!");
    }

}
