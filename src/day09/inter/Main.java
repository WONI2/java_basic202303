package day09.inter;

public class Main {
    public static void main(String[] args) {
        Bulldog bulldog = new Bulldog();

        bulldog.hunt();
        bulldog.violent();

        Duck duck = new Duck();
        duck.eat();


        //인터페이스는 다형성을 구현하는 역할.
        //인터페이스도 부모타입으로 사용 가능.
        Pet[] pets = {
                bulldog, duck, new Rabbit()
        };
        for (Pet pet : pets) {
            pet.eat();
        }
    }
}
