package day09;

public class MethodReturn {

    //리턴값이 없는 메서드 : 메서드가 코드만 실실행하고 호출부로 값을
    //전달하지 않는 경우
    static void showMultiply(int n1, int n2) {
        System.out.printf("%d X %d = %d\n", n1, n2, n1 * n2);
    }

    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static void sayHello(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어여 ㅂㅂ");
            return;
        }
        System.out.println(name + "님 하이~");
    }

    // 모든 메서드의 리턴값은 오직 한개
    //두 개의 정수를 전달받아 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 리턴


   static int[] operateAll(int n1, int n2) {
       return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }

    public static void main(String[] args) {

        //return 값이 없는 void타입 메서드는 단독호출해서 사용
        showMultiply(7, 8);

        int add = add(1, 2);
        System.out.println("add = " + add);

        showMultiply(add(33, 3), add(33, 44));

//        add(showMultiply(2,3),showMultiply(3,4));
        //리턴이 없어서 안된다.

        System.out.println("========================================");
        sayHello("김민성");
        sayHello("kin god emperor general master park");


        System.out.println("=================");

        int[] ints = operateAll(10, 3);
        System.out.println("덧셈 결과 = " +ints[0] );
        System.out.println("뺄셈 결과 = " +ints[1] );
        System.out.println("곱셈 결과 = " +ints[2] );
        System.out.println("나눗셈 결과 = " +ints[3] );

    }
}
