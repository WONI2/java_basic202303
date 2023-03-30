package day04;

//실행용 클래스
//여기엔 설계x, main메서드를 작성합니다
public class DancerMain {
    public static void main(String[] args) {
         Dancer kim = new Dancer();
         Dancer park = new Dancer("스트릿댄스");
        Dancer JANG = new Dancer("댄싱머신", "목각댄스", DanceLevel.PRO);

        Singer song = new Singer(); //

        System.out.println(kim);
        System.out.println(park);

//        kim.dancerName = "바나나";
//        kim.crewName = "서커스크루";

        System.out.println(kim.introcduce());
        System.out.println(park.introcduce());
        System.out.println(JANG.introcduce());

        kim.dance();
        park.dance();
        JANG.dance();

    }
}
