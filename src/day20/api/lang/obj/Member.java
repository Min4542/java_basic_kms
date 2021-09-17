package day20.api.lang.obj;

public class Member extends Object{

    String name;
    int age;
    String address;

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", address='" + this.address + '\'' +
                '}';
    }
}
