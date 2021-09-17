package day20.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mainpulate {
    public static void main(String[] args) {
        LocalDate orderDate = LocalDate.now();
        LocalDate takeDate = orderDate.plusDays(15);

        //시간 계산 다해줌

        System.out.println("수령 예상일:" + takeDate);

        LocalDateTime time = LocalDateTime.now()
                    .plusYears(1)
                    .plusMonths(10)
                            .plusDays(3);

        System.out.println("time = " + time);
    }
}
