package day06.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("미니");

        myCar.setSpeed(70);
        System.out.println(myCar.getSpeed());

        myCar.pressButton();

    }

}
