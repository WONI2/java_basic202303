package day06.modi.pac1;

 class B { //default 제한. 클래스에는 public과 default만 사용 가능. A에서는 같은 패키지라서 부를 수 있지만,
     //C에서는 다른 패키지이기 때문에 부를 수 없다.

    public int x1;
    int x2;
    private int x3;


    void test() {
        A a = new A(); //public
        new A(10) ; // default
//        new A("gggg"); // private라서 호출불가



        a.f1 = 1; // f1에 public이 걸려 있기 때문
        a.f2 = 2; // default는 동일한 패키지에서 사용될 수 있음
//      a.f3 = 3; //같은 클래스 내에서만 사용할 수 있는 private


       a.m1();
       a.m2();
//       a.m3(); //같은 클래스 내에서만 사용할 수 있는 private
    }


}
