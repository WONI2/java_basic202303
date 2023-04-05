package day07.inherit;

import static day07.Util.Utility.makeLine;

//수퍼클래스 (부모클래스) : 객체의 공통기능과 속성을 설계
public class Player extends Object {
    String nickName; // 캐릭터이름
    int level;
    int hp;
    int exp;

    //부모의 생성자


    public Player(String nickName) {
//        System.out.println("Player의 생성자 호출");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    public void showStatus() {
        System.out.println("========Character's info========");
        System.out.println("* name: " + this.nickName);
        System.out.println("* level: " + this.level);
        System.out.println("* hp: " + this.hp);

    }

    public void Attack(Player... targets) {

        makeLine();
        for (int i = 0; i < targets.length; i++) {
            if(targets[i].equals(this)) {
                continue;
            }else {
                int attack = (int) (Math.random() * 6) + 10;
                System.out.println(targets[i].nickName + "님이 " + attack
                        + "의 피해를 입었습니다.(남은체력 :" + (targets[i].hp - attack) + ")");
            }
        }

    }
}