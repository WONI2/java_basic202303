package day07.static_;

public class Count {

    //제한자(modifier)
    //접근 제한자(Access), 사용 제한자(Usage)
    public static int x; // 정적필드 : 모든 객체가 공유.
    // static이면 다른 객체를 계속 생성해도 x의 개수는 한 개,
    // y의 개수는 객체 수만큼 늘어남
    public int y; //인스턴스필드 : 객체별로 관리


    //정적 메서드
    public static void m1() {
        System.out.println("static 메서드 호출");

        //필드참조(static 메서드 안에서는 static 필드만 참조 가능.)

        System.out.println("x = " + x);
//        System.out.println("y = " + y);
// y는 참조가 불가. 객체가 몇 개 있을지 모르기 때문.
        // x는 this를 알 수 없음. 즉, this 정보를 확실하게 알려주면 호출이 가능
        Count c3 = new Count();
        System.out.println("c3.y = " + c3.y);
        // c3라는 것을 제한을 두기 때문에 y도 호출 가능.

    }

    //인스턴스 메서드
    public void m2() {
        System.out.println("인스턴스 메서드 호출");
        System.out.println("y = " + y); // m2()를 호출할 때,
        //객체를 확실하게 밝혀야하기 때문에, 여기서는 y도 호출이 가능.
    }


}
