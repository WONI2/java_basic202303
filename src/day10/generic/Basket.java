package day10.generic;

public class Basket<Fruit> {
    //관례적으로 <>안에 한글자로 표현함. 나중에 작성할 때 결정되는 것


    private Fruit fruit;

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}
