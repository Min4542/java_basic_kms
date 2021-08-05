package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("게임 인원(2~4명) ==>");
        //총 참여 인원 수
        int playerNum = sc.nextInt();

        //참여 인원 저장 배열
        String[] players = new String[playerNum];


        //플레이어 참여인원수 가 5초과일경우
        if (playerNum < 2 || playerNum > 4) {
            System.out.println("게임 오버 !!!!!");
            return;
        }
        //참여 인원수대로 이름을 입력 받은 후 배열에 저장
        // playerNum or players.length
        System.out.println("플레이어 이름을 등록합니다.");
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름:", i + 1);
            players[i] = sc.next();
        }

        //참여 인원 이름 출력
        System.out.println(Arrays.toString(players) + "참가!!");
        System.out.println();

        System.out.print("실탄 개수 (6미만) ==> ");
        int bullet = sc.nextInt();
        sc.nextLine();

        //탄창 배열을 생성 (공간 6개)
        boolean[] magazin = new boolean[6];

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
        //입력된 실탄 수만큼 배열의 내부값을 true로 랜덤하게 바꿔줌
        int successcount = 0; //정확히 총알을 장전한 횟수
        while (successcount < bullet) {
            int position = (int) (Math.random() * 6);
            if (!magazin[position]) { //탄창이 빈곳만
                magazin[position] = true;//장전하라
                successcount++; //성공시 카운트 증가
            }
//             if(bullet == successcount)break;
        }

//        System.out.println("탄창:" + Arrays.toString(magazin));


//        ===================게임시작 코드=============================
//          선턴 플레이어 랜덤 결정
//        System.out.println("랜덤 숫자 :" + ranNum);
        int ranNum = (int)(Math.random()*playerNum); //랜덤 호명
        System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[ranNum]);

        //한 턴 내에서 해야 할 일
        /*
        1. 탄창을 돌린다: 0~5 사이의 인덱스를 랜덤 결정한다.
        2. 격발한다: 위에서 나온 인덱스를 통해 탄창을 조회하여 실탄이 있는지 확인
        3. 사망판정: 실탄이 있었다면 사망처리, 없었다면 다음 턴으로 넘어감
        */

        while (true) {
            System.out.printf("\n[%s님의 턴 !] 실린더를 돌립니다.\n",players[ranNum]);
            int bulletPosition = (int) (Math.random() *magazin.length);
            System.out.println(" # 엔터를 누르면 격발합니다.");
            sc.nextLine();

            //사망 판정
            if(magazin[bulletPosition]){
                System.out.printf("\n빵!! [%s]님 사망....\n", players[ranNum]);
                break;
            }else {
                //생존한 경우 : 턴을 넘김
                System.out.println(" 휴.... 살았습니다!!!");
                if(ranNum == players.length-1){
                    //마지막 플레이어는 턴을 첫번째로 돌려놓는다.
                    ranNum = 0;
                }else {
                    ranNum++;
                }
            }
        }


    }
}
