package day12.player;

public class Player {

    String name;
    int level;
    int hp;

    public Player() {
        this("이름없음",1);
        System.out.println("1번 생성자");
        /*this.name = "이름없음";
        this.level = 1;
        this.hp =50;*/
    }

    public Player(String name) {
        this(name,1);
        System.out.printf("2번 생성자");
    }

    public Player(String name, int level) {
        System.out.printf("\n3번 생성자");
        this.name = name;
        this.level = level;
        this.hp =50;
    }

    void attack(Player target){ //자바의 모든 메서드는 자기자신의 this가 숨어있다 생략가능 매개변수
        System.out.printf("%s가 %s를 공격합니다.\n",this.name,target.name);
    }

    void info(){
        System.out.printf("이름: %s, 레벨: %d, 체력: %d\n",this.name,this.level,this.hp);
    }
}
