package day10.exception;

import org.w3c.dom.ls.LSOutput;

public class TryExample1 {
    public static void main(String[] args) {


    int n1 = 10, n2 = 0;
        System.out.println("나눗셈 시작");

        try {
            System.out.printf("%d / %d = %d\n",n1,n2,n1/n2);
        } catch (Exception e) {//예외발생 시 처리할 코드
            System.out.println("0으로 나눌 수 없습니다.");
        //개발 시에 쓰는 예외 관련 코드(로그 트레이싱) : 에러의 원인을 알려줌
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");

}
}
