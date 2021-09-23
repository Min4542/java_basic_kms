
package day21.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MapExample {
    public static void main(String[] args) {

        //Map: key, value의 쌍으로 데이터를 관리
        // key는 중복저장 불가능, value는 가능
        Map<String, Student> student = new HashMap<>();

        //put(k,v) : 맵에 데이터 추가
        student.put("멍멍이", new Student("김철수", 15));
        student.put("냥냥이", new Student("또치", 9));
        student.put("짹쨱이", new Student("도우너", 12));

        System.out.println(student);

        //중복된 key를 put하면 value가 수정된다.
        student.put("짹쨱이", new Student("냥냥이", 12));
        System.out.println(student);

        //get(key) : map에 저장된 객체 참조
        Student s = student.get("멍멍이");
        System.out.println("s = " + s);

        int age = student.get("냥냥이").age;

        //containsKey(k) : map에 저장된 key 존재 유무 확인
        System.out.println(student.containsKey("까갂이"));
        System.out.println(student.containsKey("짹쨱이"));

        //map의 반복문 처리
        Set<String> keys = student.keySet();
        System.out.println("keys = " + keys);
//키가 있으면 밸류는 얼마든지 찾을 수 있다.
        for (String key : keys) {
            System.out.println(student.get(key));
        }

        //remove(key): 특정 데이터셋(entry) 삭제
        student.remove("냥냥이");
        System.out.println(student.size());
        System.out.println(student);

        student.clear();
        System.out.println(student.isEmpty());


    }
}
