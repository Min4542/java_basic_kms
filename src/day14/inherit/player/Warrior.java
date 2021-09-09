package day14.inherit.player;

//Warrior + player
//상위클래스로부터 상속받은 클래스를 자식 , 하위 클래스 (sub class)
public class Warrior extends player {

    int rage;



    public Warrior(){
//        super(); 생략되있음
        System.out.println("전사 객체 생성 ");
    }

    public Warrior(String nickName, int level, int hp, int rage) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.rage = rage;
    }

    @Override // 오버라이딩이 잘됬는지 확인하는 함수
    public void info() {
        super.info();
        /*System.out.println("\n========== Warrior info ===========");
        System.out.println("# 닉네임 : " + nickName);
        System.out.println("# 레벨 : " + level);
        System.out.println("# 체력 : " + hp);*/
        System.out.println("# 분노 : " + rage);
    }


    public void fireSlash() {

    }

}
