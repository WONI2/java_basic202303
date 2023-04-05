package day08.poly.car;
//운전자 객체
public class Driver {
    //오버로딩으로 drive를 맞추기. (driveStringer에서)

//    public void drive(Mustang m) {
//        System.out.println("운전을 시작합니다");
//        m.accelerate();
//    }
//    public void drive(Stinger s) {
//        System.out.println("운전을 시작합니다");
//        s.accelerate();
//
//
//    }
// 다형성으로 매개변수를 역할타입으로 만들면 오버로딩 없이 만들 수 있음
    public void drive(Car c) {
        System.out.println("운전을 시작합니다");
        c.accelerate();


    }



}
