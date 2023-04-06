package day09.final_;

 class BagPack { //final이 붙으면 더이상 변할 것이 없다는 것. 다른 클래스로 상속금지.오버라이딩도 금지.
    //클래스에 final이 없더라고 메서드 앞에 final을 붙이면 해당 메서드만 오버라이딩 불가.
    //속성
    int size; // 가방크기(1~10)
    String brand;
    //기능
    final void putItem() {
        System.out.println("가방에 물건을 넣습니다");
    }

    public BagPack(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }
}
public class Person {
    String name;
   final String ssn;//주민번호
    static final String nation; //국적 : static과 final을 같이 써서 불변성과 유일성을 만족시키는 상수를 만들 수 있음
    BagPack bagPack;
    static {
        nation ="대한민국";
    }

    //상수는 불변성, 유일성. final은 유일성은 없음. 따라서 final은 상수라고 할 수 없음

    public Person(String name, String ssn, BagPack bagPack) {
        this.name = name;
        this.ssn = ssn;

        this.bagPack = bagPack;
    }
}
