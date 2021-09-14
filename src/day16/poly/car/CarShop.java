package day16.poly.car;

public class CarShop {

    public int sellCar(Car car){
        if ( car instanceof Sonata ){
            return 1300;
        } else if ( car instanceof Tucson ){
            return 1500;
        } else if ( car instanceof Boxster ){
            return 7800;
        }else {
            return 0;
        }
    }

}
