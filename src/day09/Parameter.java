package day09;

public class Parameter {

    //랜덤으로 음식명 하나를 리턴하는 메서드
    static String chooseRandomFood() {
        String[] foods = {"짬뽕", "볶음밥", "치킨", "삼겹살", "파스타"};
        return foods[(int) (Math.random() * foods.length)]; // ctr + alt + n
    }

    //전달받은 2개의 정수의 합을 구해서 리턴하는 메서드

    static int addTwo(int n1, int n2) {
        return n1 + n2;
    }

    //전달받은 n개의 정수의 합을 구해 리턴하는 메서드
    static int calcNumbersTotal(int[] numbers){
        int total = 0;
        for (int n : numbers) {
            total+=n;
        }
        return total;
    }

    //알스프레드 문법 추천
    static int calcNumbersTotal2(int... numbers){
        int total = 0;
        for (int n : numbers) {
            total+=n;
        }
        return total;
    }

    public static void main(String[] args) {

        String x = chooseRandomFood();
        System.out.println("x = " + x);//ctr + alt + v

        int num = addTwo(23, 3);
        System.out.println("num = " + num);

        int[] nums = {10, 20, 30};
        int allAddnumbers = calcNumbersTotal(nums);
        System.out.println("allAddnumbers = " + allAddnumbers);
        int total = calcNumbersTotal(new int[]{50, 40, 20, 40});
        System.out.println("total = " + total);

        int total2 = calcNumbersTotal2(1, 2, 3, 4, 5, 6, 7, 8, 90, 9);
        System.out.println("total2 = " + total2);
        calcNumbersTotal2(nums);

    }
}
