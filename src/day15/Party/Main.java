package day15.Party;

import day12.player.Player;
import day13.Party;

public class Main {
    public static void main(String[] args) {

        Party party = new Party(3);

        party.addPlayer(new Player("김우끼기기"));
        party.addPlayer(new Player("박범구"));
        party.addPlayer(new Player("안준호"));
        party.addPlayer(new Player("조석봉"));


        party.kickPlayer("안준호");

        party.showPartyInfo();

    }
}
