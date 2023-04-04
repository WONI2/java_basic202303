package day07.static_;

import day07.Util.Utility;
//static 필드와 메서드를 그냥 참조 가능. 앞에 Utility. 을 빼고 사용 가능.
import static day07.Util.Utility.*;
import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
    //static field는 객체 생성 전에도 참조 가능.
        out.println(Count.x);

        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();

        c2.m2(); //static이 아니기 때문에 객체 생성이 반드시 필요.


        c1.x = 10; // x값은 고정되기 때문에
        // Count.x 로 클래스 이름으로 접근 할 수 있다.

        c2.y = 20;
        c2.x++;

        out.printf("c1 = x : %d, y : %d\n", c1.x, c1.y);
        out.printf("c2 = x : %d, y : %d", c2.x, c2.y);


        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        Utility.makeLine(); //alt+enter로 import static을 만들어 줄 수 있음.

        input("메롱");


    }
}
