package day13;

public class DishNameType {
    private final String name;
    private final Dish.Type type;

    public DishNameType(Dish dish) {
        this.name = dish.getName();
        this.type = dish.getType();
    }
    public DishNameType(String name, Dish.Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Dish.Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DishNameType{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
