package day17.quiz;

//public class Child extends Parent {
//    public Child(String name) {//왜 에러 났남
//        this.name = name;
//    }
//}

public class Child extends Parent {
    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child()call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String)call");
    }
}