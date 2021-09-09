package day14.inherit.player;

public class main {
    public static void main(String[] args) {

        Warrior w = new Warrior();
        w.rage = 60;
        w.level = 20;
        w.nickName = "warrior";
        w.hp = 400;
        w.info();
        w.fireSlash();


        Mage m = new Mage();
        m.hp = 30;
        m.level = 30;
        m.nickName = "메이지유신";
        m.mana =45;
        m.info();


    }
}
