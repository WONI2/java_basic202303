package day04;

public class FieldAndLocal {
    int a; //필드, 초기화 가능성이 있고, 미리 0을 넣어 둠.
    double b;

    void mm(int b) { //b:매개변수
        int c = 1; // c: 지역변수 .어떤식으로도 값이 결정되도록 만들어줘야.


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
