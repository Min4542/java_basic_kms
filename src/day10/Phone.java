package day10;

//설계도 클래스는 main을 만들지 않습니다. 설계도
public class Phone {

    //속성: 객체의 데이터
    //필드(field)

    //고유 데이터
    //모델명 일반적으로 구체적으로 초기화 하지 않는다.
    String model;  //모델명 일반적으로 구체적으로 초기화 하지 않는다.
    String color;  //색상
    int price;  //가격


    //상태 데이터
    String[] receiveMessages = new String[3];  //받은 문자메시지들
    int messageCount;  //총 문자메시지 수
    boolean isOn;  //전원 켜진 여부

    //부품 데이터(집합관계: composition)
    Battery battery;

    //생성자(constructor)
    //객체를 생성하고 초기화를 담당

    //Phone() -> 기본생성자
     Phone() {

         model = "갤럭시 Z-Fold2";
         color = "펄 블루";
         price = 3000000;
         isOn = true;

     }

     //생성자는 여러 개 선언 할 수 있음 (오버로딩)
    //오버로딩 규칙: 매개변수의 타입이나 개수나 순서가 달라야함
    //Phone(String)
    Phone(String modelName) {

        model = modelName;
        color = "스노우 화이트";
        price = 1200000;
        isOn = true;

    }

    //Phone(String, String) 순서가 중요하다.
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

    //문자메시지를 보내는 기능
    boolean sendMessage(Phone tagetPhone, String message) {
         if (!isOn){
             System.out.printf("%s의 전원을 먼저키세요!\n",model);

             return false;
         }else if(!tagetPhone.isOn){
             System.out.printf("상대방 %s의 전원이 꺼져있습니다.\n",tagetPhone.model);

             return false;
         }

         //메시지를 보낼 수 있는 경우
        if (tagetPhone.messageCount<tagetPhone.receiveMessages.length) {
            tagetPhone.receiveMessages[tagetPhone.messageCount++] = message;

            System.out.println("메시지가 성공적으로 전송됨.");
            return true;
        } else {//상대방 메시지함이 다 찬 경우
            System.out.println("상대방의 메시지함이 가득 찼습니다.");
            return false;
        }

    }

    //수신 메시지함을 확인하는 기능
    void  checkMessages() {
        System.out.printf("\n====== [%s]의 메시지함 =====\n",model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n",i+1,receiveMessages[i]);
        }
    }

    //배터리 충전 기능
    void changeBattery(){
         battery = new Battery("삼성");
    }
}
