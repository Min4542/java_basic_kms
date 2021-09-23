
package day21.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ㅇㄴㅇㅁㄴㅇㄴㅁㅇㄴㅇㅎㅂ
 * ㅇㄻㄹㅇㄻㅇ
 * ㅎㄹㅇㄶㄹㅇㄶ
 *
 * @author 김민성
 * @version 1.0.0
 * @deprecated dfsdsd
 */

public class ListExample {

    public static void main(String[] args) {

        //리스트 : 순차형 자료구조 , 데이터가 순서대로 저장
        //          , 중복저장 허용, 인덱스를 가짐


//        String[] sArr = new String[10];

        List<String> sList = new ArrayList();

        //add(): 리스트에 객체를 추가
        sList.add("멍뭉이");
        sList.add("멍뭉이");
        sList.add("군인");
        sList.add("멍뭉이");
        sList.add("야옹이");

        System.out.println(sList);

        //size() : 저장된 객체의 수 확인
        int size = sList.size();
        System.out.println("size = " + size);

        //add(index, object) : 증간 삽입

        sList.add(2, "어흥");
        System.out.println(sList);


        //set(index, obj) : 객체의 수정
        sList.set(3, "메롱이");
        System.out.println(sList);

        //remove(idx), remove(obj) : 삭제
        sList.remove("어흥"); //제일 먼저 발견된걸 지운다
        sList.remove(1);
        System.out.println(sList);

        //get(idx) : 리스트에서 객체 참조
        String s = sList.get(2);
        System.out.println("s = " + s);

        //indexOf(obj) : 저장된 인덱스 탐색
        int idx = sList.indexOf("야옹이");
        System.out.println("idx = " + idx);

        //contains(obj) : 객체의 저장 유무 확인
        boolean b = sList.contains("거미");
        System.out.println("b = " + b);

        //list의 반복문 처리
        System.out.println("==================");
        for (int i = 0; i < sList.size(); i++) {
            //전체 반복
            System.out.println(sList.get(i));
        }

        System.out.println("=================");
        for (String str : sList) {
            System.out.println(str);
        }

        //clear() : 리스트 내부 객체 전체 삭제
        System.out.println("=================");
        sList.clear();
        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty());

        //초기값을 가진 리스트
//        int[] iArr = {10,20,20};
        System.out.println("=================");
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 20, 30, 45 ,234, 1234,  234)
        );

        System.out.println(numbers);

        //오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        //내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

    }

}
