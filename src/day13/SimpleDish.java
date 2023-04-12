package day13;

//요리정보 중에 이름과 칼로리만 관리하는 객체

import day13.Dish.Type;

public class SimpleDish {
    private final String name;
    private final String calories;

    private Type type;

    public SimpleDish(String name, Type type) {
        this.name = name;
        this.type = type;
        calories = null;
    }

    public SimpleDish(String name, String calories, Type type) {
        this.name = name;
        this.calories = calories;
        this.type = type;
    }

    public SimpleDish (Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories()+"kcal";

    }


    public SimpleDish(String name, String calories) {
        this.name = name;
        this.calories = calories;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCalories() {
        return calories;
    }
    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                '}';
    }

}
