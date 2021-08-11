//패키지는 관례상 소문자만 쓴다.
package day11;



//다른 패키지에 있는 클래스를 불러올 때 패키지 명을 생략할 수 있게 해줌

//import day11.fruit.Banana;
//import day11.fruit.Mango;
import day11.fruit.*;//day11에 있는 모든 것을 임포트 한다.
import day11.company.*;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Banana b = new Banana();
        Mango mango = new Mango();
       day11.company.Apple apple = new day11.company.Apple();
       day11.fruit.Apple apple1 = new day11.fruit.Apple();
        //new day11.fruit.Banana();

        Scanner sc = new Scanner(System.in);
//        java.util.Scanner sc = new java.util.Scanner(System.in);


    }
}
