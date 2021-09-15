package day18.exception;

public class TryExample1 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;

        System.out.println("나눗셈 시작");

        try {
            //예외 발생 가능성이 있는 코드
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2); //터질 가능성이 있다. 에러가 안나면 트라이안에 있는 코드 실행
        }catch (Exception e){
            //예외 발생시 실행할 코드
            System.out.println("0으로 나누면 안됩니다."); //에러가 나면 캐치안에 있는 코드 실행
        }
        System.out.println("프로그램 정상 종료!");

    }
}
