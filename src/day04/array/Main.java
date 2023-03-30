package day04.array;

public class Main {
    public static void main(String[] args) {

        StringList foodList = new StringList("김치찌개");
        foodList.push("짜장면");
        foodList.push("깐풍기");
        foodList.push("짬뽕");

        System.out.println(foodList);

        StringList userNameList = new StringList();
        userNameList.push("바둑이");
        userNameList.push("고양희");
        System.out.println(userNameList);

        foodList.pop();
        userNameList.pop();

        System.out.println("foodList = " + foodList);
        System.out.println("foodList.size() = " + foodList.size());

        System.out.println("userNameList = " + userNameList);
        System.out.println("userNameList.size() = " + userNameList.size());
    }
}
