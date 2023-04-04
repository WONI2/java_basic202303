package day07.inherit;

public class Mage extends Player{


    int mana; //마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }


    //썬더볼트

    public void thunderBolt() {

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
