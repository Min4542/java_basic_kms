package day03;

public class RandomExample {
    public static void main(String[] args) {

        // Math.random() : 0.0 이상 1.0 미만의 실수 난수 생성
        double rn = Math.random();
        System.out.println("랜덤값:" + rn);

        /*
        * 랜덤 정수 생성 방법
        *
        * # 1이상 10이하의 랜덤 정수 생성
        *
        * Math.ramdom()   -> 0.0 <= ~ < 1.0
        * Math.ramdom() * 10   -> 0.0 <= ~ < 10.0
        * (int)(Math.random() *10) -> 0 <= ~ <10
        * (int)(Math.random() *10)+1 -> 1 <= ~ <11
        *
        * #공식: x이상 y이하의 랜덤 정수 (y미만 일 때 1만 더해준다다)
       * (int) (Math.random() * (y-x+1))+x
        * */


        int ri = (int) (Math.random() * 10 + 1); // alr + enter
        System.out.println("랜덤 정수:" + ri);
    }
}
