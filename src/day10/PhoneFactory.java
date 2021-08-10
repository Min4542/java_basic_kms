package day10;

//실행용 클래스 (객체를 생성해서 사용하는 곳 )에 main을 만듭니다.
public class PhoneFactory {

    public static void main(String[] args) {

        //객체의 생성
        //Phone이라는 타입
        Phone galaxyS21 = new Phone();
        System.out.println("galaxyS21 = " + galaxyS21);

        //객체의 속성과 기능 참조: 참조연산자 . 을 사용
//        galaxyS21.model = "갤럭시S21";
//        galaxyS21.color = "크롬블랙";
//        galaxyS21.price = 100000;

//        galaxyS21.powerOn();
        galaxyS21.showSpec(); //핸드폰만 사용 가능한 메서드

        System.out.println("==============================");

//        Phone iPhoneX = new Phone();
//        iPhoneX.model = "아이폰X";
//        iPhoneX.color = "스노우 화이트";
//        iPhoneX.price = 10000000;
//
//        iPhoneX.powerOn();
//        iPhoneX.showSpec();
//        galaxyS21.showSpec();

        Phone iPhoneX = new Phone("아이폰X");
        iPhoneX.showSpec();

        System.out.println("================================");

        Phone lgv6 = new Phone("LG V6","에메랄드 그린");
        lgv6.showSpec();
    }
}

