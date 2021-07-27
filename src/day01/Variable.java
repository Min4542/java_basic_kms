package day01;

public class Variable {
    //실행코드들은 main함수 내무에 작성해야 한다.
    public static void main(String[] args) {

        //변수 선언
        int number;
        //변수 초기화
        number =100;

        System.out.println(number);

        //선언타입이 다른 값은 저장 불가
        int point = 78;
//        point = 78.99;
        int copynum = number * 3;
        System.out.println("copynum = " + copynum);

        //문자열 저장시에는 String타입 사용
        //문자열값에는 반드시 겹따옴표만 사용
        String nickName = "뽀로로";

//        int n1 = 10;
//        int n2 = 20;
        //자바 변수 스코프 (유효 범위): 블록 스코프
        //변수는 자기가 선언된 블록을 벗어나면 메모리에서 제거됨
        int n1=10,n2=20;

        if(true){
            int n3=n1+n2;
            System.out.println("n3 = " + n3);
        }//end if

        int n3 =100;
        System.out.println(n3);

    }//end main
//    int n4 = n1+ n2;
}//end class
