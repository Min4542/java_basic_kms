package day17.quiz;
//
//public class Parent {
//    public String name;
//
//    public Parent(String name) {
//        this.name = name;
//    }
//}
//

public class Parent {
    public String nation;

    public Parent() {
        this("대한민국");
        System.out.println("Parent() call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String)call");
    }
}