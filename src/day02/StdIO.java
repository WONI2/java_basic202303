package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {

    public static void main(String[] args) throws IOException {
        String dog = "멍멍이", cat = "야옹이";

        System.out.print(dog);
        System.out.println(cat);


        int month = 10;
        int day = 9;
        String anni = "한글날";

        System.out.println(month + "월 " + day + "일은 " + anni + "입니다");
        System.out.printf("%d월 %d일은 %s입니다\n", month, day, anni);
        //%d : 정수(10진수), %s : 문자열, %f: 실수


        double rate = 12.3456;
        System.out.printf("오늘의 할인율은 %.2f%%입니다.\n", rate);
        //f는 무조건 소숫점아래 6자리까지 보여주니까 자릿수를 항상 작성해줄 것.
        //%f를 사용하고, 특수문자 %처리 하고 싶으면 %%로 써줘야 함.


        //표준입력
//        int result = System.in.read();
//        System.out.println("result = " + result); //입력을 아스키코드로 처리.
//

        Scanner sc = new Scanner(System.in);

        //사용 자제 : int result = sc.nextInt();

        String str = sc.nextLine();
        int result = 0 ;
        try {
            //str 정수 변환
            result = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("정수입력");
        }
        System.out.println("result = " + result);


    }


}
