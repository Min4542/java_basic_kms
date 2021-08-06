package day09;
/*
    1. 자바의 메서드는 클래스 내부, 메서드 외부에 선언합니다.
    2. 메서드는 메서드 안에서만 호출할 수 있습니다.
*/
public class MethodBasic {
    //1 ~ x까지의 총합
       static int calcTotal(int x){ //매개변수(parameter) = x
           System.out.println("calcTotal 호출됨!");
            int total =0;
            for (int n = 0; n <= x; n++) {
                total+=n;
            }
            return  total;
        }
    public static void main(String[] args) {

           //함수의 호출
     int result =   calcTotal(10); //인수 인자 아규먼츠(arguments)
        System.out.println("result = " + result);

        int i = calcTotal(100);
        System.out.println("i = " + i);



    }
}
