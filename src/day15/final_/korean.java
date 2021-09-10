package day15.final_;

public class korean {
    String name; //이름
    //상수는 불변해야 하며 공유되어야 함.
    final static String Nation ; //
    String sid; //주민번호

    static {
        Nation = "한국";
    }
    public korean(String name,  String sid) {

        this.name = name;
        this.sid = sid;
    }

    public static void main(String[] args) {

        korean park = new korean("박영희","9999-9868");
        park.name ="garner";
//        park.nation = "미국";

        korean kim = new korean("김철수",  "69462-58165");


    }

}
