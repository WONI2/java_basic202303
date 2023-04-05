package day08.poly.car;
//자동차 판매 대리점
public class CarShop {

    Car[] cars;

    Mustang[] mustangs;
    Stinger[] stingers;
    Sonata[] sonatas;


    //대리점에 차를 입고하는 기능
    public  void importCars() {

        Car m = new Mustang();



        //배열을 이종모음을 할 수 있도록 가능하게 만들어줌
        cars = new Car[] {
                new Mustang(),
                new Stinger(),
                new Sonata(),
                new Stinger()

        };


        //문자열과 정수와 논리를 배열에 담을 수 있게 만듦.
        Object[] oArr ={
                50, "gg", new Stinger(),false
        };

    }

    //주행테스트 기능

    public void runTest() {
        importCars();//차입고
        for (Car car : cars) {
            car.accelerate();
            //다형성을 통한 공통처리를 위해 Car에서도 accelerate()를 만들어 줘야.

        }
    }


    //차를 고객에게 인도하는 기능
    // 리턴 타입에 적용되는 다형성.
    public Car exportCar(int money) {
        if(money == 6000) {
            return new Mustang();
        }else if(money == 5000) {
            return new Stinger();
        }else if(money == 4000) {
            return new Sonata();
        }else {
            return null;
        }
    }

}
