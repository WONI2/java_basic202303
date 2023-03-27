package day01;

public class DataType {

    public static void main(String[] args) {

        int a = 30000;

        System.out.println("a = " + a);


// 논리형에 true/false만 존재. 0과 1 로 표현되지 않음. 대문자로는 쓸 수 없음.


        char A = 'A';
        System.out.println(A+1); //66 아스키코드. (char)로 캐스팅해야 B가 나올수 있음.

        char c2 = 44032;
        System.out.println("c2 = " + c2);

        String s = "안녕"; // string은 기본타입이 아니고 객체. 사실 char의 배열.



    }
}
