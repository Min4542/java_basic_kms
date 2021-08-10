package day10;

//설계도 클래스는 main을 만들지 않습니다. 설계도
public class Phone {

    //속성: 객체의 데이터
    //필드(field)
    //모델명 일반적으로 구체적으로 초기화 하지 않는다.
    String model;  //모델명 일반적으로 구체적으로 초기화 하지 않는다.
    String color;  //색상
    int price;  //가격
    String[] receiveMessages;  //받은 문자메시지들
    int messageCount;  //총 문자메시지 수
    boolean isOn;  //전원 켜진 여부

    //생성자(constructor)
    //객체를 생성하고 초기화를 담당
     Phone() {

         model = "갤럭시 Z-Fold2";
         color = "펄 블루";
         price = 3000000;
         isOn = true;

     }

     //생성자는 여러 개 선언 할 수 있음 (오버로딩)
    Phone(String modelName) {

        model = modelName;
        color = "스노우 화이트";
        price = 1200000;
        isOn = true;

    }
    Phone(String modelName , String colorName) {

        model = modelName;
        color = colorName;
        price = 1300000;
        isOn = true;

    }

    //기능: 객체의 행위
    //메서드(method): static은 붙이지 마세요.

    //전원 켜는 기능
    void powerOn() {
        isOn = true;
        System.out.println(model + "의 전원을 킵니다.");
    }

    void powerOff() {
        isOn = false;
        System.out.println(model + "의 전원을 끕니다.");
    }

    void showSpec() {
        if (!isOn) {
            System.out.println("전원을 먼저 키세요!!");
            return;
        } else {
            System.out.println("\n### 휴대폰 정보 ###");
            System.out.println("*모델명:" + model);
            System.out.println("*색상:" + color);
            System.out.println("*가격:" + price + "원");
        }
    }


}
