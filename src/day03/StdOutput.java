package day03;

public class StdOutput {
    public static void main(String[] args) {
        String dog = "멍멍이";
        String cat = "야옹이";

        System.out.println(dog);
        System.out.println(cat);

        String filePath = "D:\temp\new.jpg";
        String filePath2 = "D:\\temp\\new.jpg";
        System.out.println(filePath);
        System.out.println(filePath2);

        String msg = "He said\"Warning!\"to me";
        System.out.println(msg);

        int month = 8;
        int day = 15;
        String anni = "광복절";

        System.out.println(month + "월" + day + "일은" + anni + "입니다.");

        System.out.printf("%d월 %d일은 %s입니다.\n",month,day,anni);
        System.out.println("안녕");

        //%f는 언제나 소수점 6자리까지 표현한다.
        double saleRate = 0.25;
        System.out.printf("오늘의 할인율은 %.2f%%입니다.\n",saleRate*100);
    }
}
