package day08.poly;


class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class Basic {

    // 자식객체는 상속관계에 있는 상위타입을 사용할 수 있다

   A x1 = new A();
   B x2 = new B();
   C x3 = new C();
   D x4 = new D();
   E x5 = new E();


   A x6 = new B();
   A x7 = new C();
   A x8 = new D();
   A x9 = new E();


   void test() {
       int a = 10;
       double b = a;

       B x = new B();
       A z = x; // A가 더 큰 상황. 따라서 가능. 형변환의 원리와 같음.


   }

}
