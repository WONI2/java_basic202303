package day07.protec.pac2;

import day07.protec.pac1.A;

public class D extends A {

    D() {
        super(10);   //상속을 받아서 접근 가능.  int는 접근 가능하지만, string은 불가
        f1 = 1; //protected는 상속을 통해 접근 가능. default는 아예불가
//        f2 = 2; //f2는 접근불가.



    }
}
