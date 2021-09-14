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

        System.out.println("========================");

       Sonata mySonata = (Sonata) park.buyCar("소나타");//리턴받는 순간에 타입 캐스팅 해준다.
        mySonata.run();

        mySonata.joinClub();

        sArr[0] = mySonata; //업캐스팅 굳이 안해도 된다.

        System.out.println("========================");
        CarShop carShop = new CarShop();

        int money = carShop.sellCar(boxster);
        System.out.println("money = " + money);


    }

}
