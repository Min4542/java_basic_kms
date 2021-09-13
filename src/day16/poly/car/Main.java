package day16.poly.car;

public class Main {

    public static void main(String[] args) {

        Car tucson = new Tucson();
        Car sonata = new Sonata();
        Car boxster = new Boxster();

        Car[] sArr = {sonata, tucson, boxster, new Boxster()};

        for (Car car : sArr) {
            car.run();
        }

        System.out.println("======================");

        /*Rich rich = new Rich();
        rich.myCars = new Tucson[30];
        rich.myCars[0] =Tucson;*/

        Driver park = new Driver();
        park.drive(new Boxster() );

    }

}
