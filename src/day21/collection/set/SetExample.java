package day21.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //set: 중복 저장 허용 X, 순서없이 빠르게 저장, 전체탐색속도 빠름

        Set<String> set = new HashSet();

        //add(obj) : set에 객체 추가
        set.add("김맣이 ");
        set.add("축구");
        set.add("야구");

        System.out.println("set = " + set.size());
        System.out.println(set); //탐색용도로 쓰면 안된다.

        //set 반목문 처리
        System.out.println("=============");
        for (String s : set) {
            System.out.println(s);
        }

        //remove(obj) : set의 객체 삭제
        set.remove("야구");
        System.out.println(set);

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

    }

}
