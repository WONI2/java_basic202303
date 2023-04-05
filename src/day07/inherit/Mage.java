package day07.inherit;

import day07.Util.Utility;

import static day07.Util.Utility.*;

public class Mage extends Player{


    int mana; //마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }


    //썬더볼트

    public void thunderBolt(Player ...targets) { //Player의 배열로 받는 것
        System.out.println(nickName+"님 썬더볼트를 시전합니다");
        Attack(targets);

//        makeLine();
//        for (int i = 0; i < targets.length; i++) {
//            int attack = (int)(Math.random()*6)+10;
//            System.out.println(targets[i].nickName+"님이 "+attack
//                            +"의 피해를 입었습니다.(남은체력 :"+(targets[i].hp-attack)+")");
        }







    @Override
    public void showStatus() { //alt + insert -> 메서드 재정의 // ctrl + o
        System.out.println("========Character's info========");
        System.out.println("* name: " +this.nickName);
        System.out.println("* level: " +this.level);
        System.out.println("* hp: " +this.hp);
        System.out.println("* mana : "+this.mana);
    }
}
