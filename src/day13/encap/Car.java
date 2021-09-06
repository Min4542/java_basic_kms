package day13.encap;

public class Car {

    //속도
   private int speed;

   //변속 모드 (D , N , R , P)
   private char mode;

   //시동 상태 체크
    private  boolean startFlag;



   //숨겨진 필드값을 설계자의 의도대로 설정할 수 있게 하는
    //메서드 setter

    public void setMode(char mode){

        if(!startFlag){
            System.out.println("시동을 먼저 걸어주세요");
            return;
        }

        switch (mode){
            case 'D': case 'R': case 'N': case 'P':
                this.mode = mode;
                System.out.println("변속이 성공적으로 수행되었습니다");
                showMode();
                break;

            default:
                System.out.println("잘못된 기어 모드 설정입니다.");
                System.out.println("P모드롤 자동 세팅합니다.");
                this.mode = 'P';
                showMode();
        }

    }

    //현재 변속모드를 보여주는 메서드
    void showMode() {
        System.out.println("현재 기어모드: "+ this.mode);
    }

   //속도를 참조할 수 있도록 해주는 메서드 getter
    public int getSpeed(){
        return this.speed;
        //같은 클래스는 참조 가능
    }

    //감속기능
    public void slowdown(){

        if(this.speed <= 0){
            this.speed = 0;
            System.out.println("더 이상 감속할 수 없습니다.");
            return;
        }

        this.speed -=50;
        System.out.printf("현재 속도는 %dkm/h 입니다.\n",this.speed);
    }

    //가속기능
    void accelerator(){
        this.speed += 50;
        System.out.printf("현재 속도는 %dkm/h 입니다.\n",this.speed);

        if(this.speed >= 200){
            System.out.println("과속은 위험합니다. 속도를 100으로 제한합니다.");
            this.speed = 100;
        }
    }

    //연료가 분사되는 기능
    public void engineStart(){
        startInjectionGasoline();
        moveCylinder();
        System.out.println("시동이 걸립니다");
        startFlag = true;
    }

    //은닉하는법
    private void startInjectionGasoline(){
        System.out.println("연료를 주입합니다.");
    }
    //은닉하는법
   private void moveCylinder(){
        System.out.println("실린더가 움직입니다.");
    }

}
