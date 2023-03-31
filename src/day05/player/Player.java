package day05.player;

public class Player {
    String nickName; // 캐릭터 닉네임
    int level; //게임 레벨
    int hp; // 체력


    //생성자
//    Player(String inputName) { //생성자에도 this가 포함되어 있음
//        this.nickName= inputName;
//        level = 1;
//        hp = 50;
//
//    }
//    public Player(String nickName) {
//       this.nickName = nickName;
//       this.level = 1;
//       this.hp = 50;
//    }

    public Player() {
        this("이름없음"); // 첫 줄에 적어야. 나의 또다른 생성자를 부를 때 쓰는 것.

        System.out.println("1번 생성자 호출");
        this.nickName = "이름없음";
        this.level = 1;
        this.hp = hp;
    }
    public Player(String nickName) {
        this(nickName,1, 50); //3번생성자 호출해서 사용
        System.out.println("2번 생성자 호출");

    }

    public Player(String nickName, int level, int hp) {
        System.out.println("3번 생성자 호출");
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    //기능 - 메서드
    void attack(Player this, Player target) {
        System.out.println("target의 주소: "+target);
        System.out.println("this의 주소: "+this);// 매개변수를 하나만 가지고 있는 것 처럼 보이지만 사실상 this를 가지고 있음

        if(this == target) return;

        //맞은 player의 체력을 10~15 감소시킴
        int damage = (int) (Math.random() * 6 + 10);

        target.hp -= damage;

        //전투 로그 출력
        //가해자가 피해자를 공격해서 **의 피해를 입힘
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입혔습니다\n",
                this.nickName, target.nickName, damage );


    }



}
