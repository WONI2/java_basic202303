package day09.abs;

public abstract class Pet {
    //추상화 1. 객체생성 불가
    //      2. 메서드는 오버라이딩을 위한 껍데기 역할에 국한되도록 재한

    private String name;// 이름
    private String kind;
    private int age;


    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }


    //오버라이딩을 위한 메서드
    //클래스가 추상이 아니면 추상메서드 선언 불가.
    //추상 클래스여도 일반 메서드 생성 가능=>선택기능
    public abstract void takeNap();
    //추상화를 하기 때문에 블럭이 필요하지 않음.
    //추상메서드는 해당 기능이 필수적인 것으로 만듦.
    public abstract void eat();

    public void walk() {
        System.out.println("애완동물은 산책을 합니다.");
    }
}
