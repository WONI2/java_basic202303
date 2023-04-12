package day13;

import java.util.Comparator;

import static day13.Menu.menuList;

public class Finding {
    public static void main(String[] args) {

        //메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가?

        boolean flag = menuList.stream().anyMatch(d -> d.isVegeterian());
        System.out.println(flag);//true

        boolean flag2 = menuList.stream().anyMatch(d -> d.getCalories() < 100);
        System.out.println(flag2); //false

        //메뉴 목록에 모든 요리가 1000cal 미만인가?
        boolean flag3 = menuList.stream().allMatch(d -> d.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);//true

        //noneMatch. allMatch의 반대 연산
        boolean flag4 = menuList.stream().noneMatch(d -> d.getCalories() < 1000);
        System.out.println("flag4 = " + flag4);//false

        //Comparator는?
        Dish dish = menuList.stream()
                .min(Comparator.comparing(d -> d.getCalories()))
                .get();



    }
}
