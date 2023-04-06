package day09.inter;

import java.util.ArrayList;

public class Bulldog implements Pet,BadAnimal{
    //badanimal이 이미 wild와 huntable을 다중상속 받았기 때문에
    //bulldog은 badanimal만 받으면 둘 다 받은 것과 마찬가지가 됨.

    ArrayList list;
    @Override
    public void hunt() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void violent() {

    }
}
