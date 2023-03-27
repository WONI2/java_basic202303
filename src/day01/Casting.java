package day01;

public class Casting {

    public static void main(String[] args) {

        byte a = 100;
        int b = a;

        //MSB : 0은 양수, 1은 음수. 2진수의 맨 앞자리는 부호를 표현.
        int c = 1000; // c를 2진수: 00000000 00000000 0000 0011 1110 1000
        byte d = (byte)c;
        //d: 1 110 1000 숫자만 가져가는데 맨 앞자리가 1이기 때문에 -로 나옴.
        System.out.println("d = " + d); // -24.

        // 음수 표현 :
        // 1의 보수 변환: 비트 반전.
        // 8(1byte): 0000 1000, -8 : 1111 0111
        //2의 보수 변환 : +1 -->  1111 1000  --> 컴퓨터가 생각하는 -8
        //-8과 8을 더하면 1byte 내에서 계산, 1 0000 0000 으로 나오는데, 자릿수를 넘어서서 1을 삭제. 따라서 0이 나옴


        //다운캐스팅은 데이터소실의 위험성이 있다.




        //타입이 다른 데이터의 연산
        int k = 100;
        double j = 5.5;

        //타입이 다르면 큰 타입에 맞춰서 변환 후 연산 진행.
        double v = k + j;

        char c1 ='a';
        int alpha = 1;

        int i = c1 + alpha;
        System.out.println(i); // 98. alpha에 맞춰져서 c1도 int로 변환
//int보다 작은 데이터(byte, short, char)끼리의 연산은 무조건 둘 다 int로 변환

        byte b1 = 100;
        byte b2 = 20;
        int b3 = b1 + b2; // 둘 다 byte여도 int로 바꿔서 계산.
        // 당장  두 변수에 저장되는 값이 안전하더라도 이후 연산한 값의 안전한 처리를 위해 int로 변환하여 계산

        int g = 24;
        double result = (double)g / 5 ;
        System.out.println("result = " + result);


        //
       /* char c2 = 'B';
        char c3 = 'a';

        System.out.println(c2+c3);*/


    }
}
