package day06.modi.pac2;

import day06.modi.pac1.A;

public class C {

    void test() {
        A a =new A(); //A 생성자에서도 접근제한이 있음. 해당 생성자로 이동해서 public을 해줌.
//        new A(11);  //접근 불가
//        new A("ggg"); // 접근 불가

        a.f1 = 10;
//        a.f2 = 20; //default. 따라서 접근 제한
//        a.f3 = 30; //private. 따라서 접근 제한

        a.m1();
//        a.m2(); //default. 따라서 접근 제한
//        a.m3(); //private. 따라서 접근 제한


    }
}
