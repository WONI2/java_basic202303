package day02;

import java.util.Scanner;

public class SwitchExample {
    public static final String SPRING = "봄";
    public static void main(String[] args) {

        //자바 상수

        System.out.println("***여행지 추천***");

        System.out.println("[원하는 계절을 입력하세요]");
        System.out.print(">>"); // 봄 여름 가을 겨울

        Scanner sc = new Scanner(System.in);

  /*      String season = sc.nextLine();


        // switch 문에는 정수, 문자형, 변수를 써야 함
        switch (season) {
            //case는 반드시 상수 쓸 것 , 범위도 쓸 수 없음
            case SPRING:
                System.out.println("봄에는 여의도를 가세요 ");
                break;//switch문의 종료.
            case "여름":
                System.out.println("여름에는 홍천을 가세요 ");
                break;
            case "가을":
                System.out.println("가을에는 춘천을 가세요 ");
                break;
            case "겨울":
                System.out.println("겨울에는 덕유산을 가세요 ");
                break;
            default: //else와 같은 효과
                System.out.println("계절을 잘 입력하세요!!!!!!@!!");

        }
*/
        System.out.print("정말로 종료하시겠습니까? [y/n]>>");

        String answer = sc.nextLine();

        switch (answer.toLowerCase().charAt(0)) {
            case 'y' : case 'ㅛ' : //char 타입으로 해줬기 때문에
                 System.out.println("종료합니다.");
                break;
            case 'n' : case 'ㅜ' :
                System.out.println("취소합니다.");
                break;
        }


    }
}
