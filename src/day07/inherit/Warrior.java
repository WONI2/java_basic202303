package day07.inherit;

public class Warrior extends Player {


    int rage; //분노게이지

    public Warrior() {
        this("이름없음"); // super를 같이 쓸 수 없음. 이미 불러오는 생성자에서 super를 가지고 있음


    }

    public Warrior(String nickName) {
       super(nickName); //숨어있는 super. 부모의 기본 생성자. 부모의 기본 생성자가 없으면 에러.
        this.rage = 20;
    }

    public void powerSlash(Player...targets) {
        System.out.println(this.nickName+"님이 파워슬래시를 시전합니다");
        Attack(targets);

    }

    //오버라이딩 : 부모의 시그니처(리턴타입, 이름, 파라미터)를 똑같이 사용.
    //           접근제한자는 무조건 부모보다 public 해야 함.

    @Override //오버라이딩 검사 진행. 정확한 오버라이딩이 맞는지 검사해줌.
    public void showStatus() {

        super.showStatus(); // 부모가 가진 원본 내용들을 불러 올 수 있음
        System.out.println("* rage : "+this.rage);
    }



}
