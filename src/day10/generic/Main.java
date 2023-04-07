package day10.generic;

public class Main {

    public static void main(String[] args) {
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple()); // 사과바구니에는 사과만 담고 싶음
        Apple apple = ab.getApple(); //그래서 사과 바구니에서는 사과만 나옴

        BananaBasket bb = new BananaBasket();
       bb.setBanana(new Banana());

        Basket<Apple> apples = new Basket();
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana());

        Apple fruit = apples.getFruit();

        Basket<Banana> bananas = new Basket<>();
        bananas.setFruit(new Banana());
//        bananas.setFruit(new Apple());

        Banana fruit1 = bananas.getFruit();



        MyList<String> sl = new MyList<>();
        sl.push("랄랄");

        MyList<Integer> n = new MyList<>();
        n.push(10);







    }
}
