package day19.inter;

public class Dog extends Animal implements Pet {

    @Override
    public void eat() {
        Pet.super.eat();
    }

    @Override
    public void play() {
        System.out.println("강이자는 뛰면서 놀아요~");
    }

}
