package day19.inter;

public class Cat implements Pet {

    @Override
    public void eat() {
        Pet.super.eat();
    }

    @Override
    public void play() {
        System.out.println("고양이는 캣타워에서 놀아요~");
    }

}
