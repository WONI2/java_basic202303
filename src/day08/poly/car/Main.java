package day08.poly.car;

import day07.Util.Utility;

import static day07.Util.Utility.*;

public class Main {

    public static void main(String[] args) {
        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();
        park.drive(new Mustang());
        park.drive(new Stinger());
        park.drive(new Sonata());

        makeLine();
        Mustang mustang = new Mustang();
        mustang.accelerate();
        mustang.powerSound(); //머스탱만의 기능. Car 타입으로 설정하면, Mustang타입만의 것을 가져올 수 없음

        makeLine();

//        Car car = shop.exportCar(6000);
        Mustang car = (Mustang) shop.exportCar(6000);
        //타입 캐스팅으로 다운해줘야, mustang만의 기능을 사용할 수 있도록
        //타입에 맞게 캐스팅해주는 것에 주의

        //타입을 검사 해주는 기능
//        System.out.println(car instanceof Stinger); //false
//        System.out.println(car instanceof Mustang); //true


//        System.out.println("car =" +car);

        car.powerSound();

    }
}
