package day13;

import java.lang.reflect.Type;

public class Dish {

    //final만 붙으면 한 번 정해지면 바꿀 수 없음

    private final String name; //요리이름
    private final boolean vegeterian; //채식주의여부
    private final int calories; //칼로리
    private final Type type; //

    public enum Type {
        MEAT, FISH, OTHER
    }

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    } //생성자를 통해 초기화로 final된 명을 결정하면 더이상 변경 할 수 없음

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
