package day14.inherit.player;

public class Hunter extends player {

    String beast;


    public Hunter() {
    }

    public Hunter(String nickName, int level, int hp, String beast) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.beast = beast;
    }

    @Override // =메소드 재정의 more public
    public void info() {
       /* System.out.println("\n========== Hunter info ===========");
        System.out.println("# 닉네임 : " + nickName);
        System.out.println("# 레벨 : " + level);
        System.out.println("# 체력 : " + hp);*/
        super.info(); //부모 클래스의 info를 호출한다. Super = 부모 클래스
        System.out.println("# 동물 : " + beast);

    }


    public void thunderShot() {

    }

}
