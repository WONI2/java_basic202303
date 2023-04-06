package day09.abs;

public class Main {

    public static void main(String[] args) {
        Pet[] pets = {
                new Dog("포리", "말티즈", 3),
                new Dog("뽀삐", "포메라니안", 4),
                new Cat("똥글이", "러시안블루", 5)
        };


        for (Pet pet : pets) {
            pet.takeNap();
        }
    }
}
