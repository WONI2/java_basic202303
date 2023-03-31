package day05.player;

public class main {

    public static void main(String[] args) {
        Player parking = new Player("주차왕파킹");
        Player gondue  = new Player("공주");

        System.out.println("=========================");
        Player noname = new Player(); //2번 생성자와 1번 생성자를 둘 다 호출.

        gondue.attack(parking);

        System.out.println("parking 주소: "+parking);
        System.out.println("gondue 주소: "+gondue);
//        System.out.println("주차왕의 남은 체력 : "+ parking.hp);

    }
}
