package day13;

import day07.Util.Utility;

import java.util.List;
import java.util.stream.Collectors;

import static day07.Util.Utility.*;
import static day13.Menu.*;

public class Mapping {

    public static void main(String[] args) {

        //stream의 map. 리스트에서 워하는 정보만 추출

        //메뉴 목록에서 요리의 이름들만 목록으로 추출
        List<String> dishNames = menuList.stream().map(d -> d.getName()).collect(Collectors.toList());
        System.out.println("dishNames = " + dishNames);
        makeLine();

        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );
        List<Integer> wordLengths = words.stream().map(w -> w.length()).collect(Collectors.toList());
        System.out.println("wordLengths = " + wordLengths);

        makeLine();

        //메뉴 목록에서 메뉴 이름과 칼로리를 추출하는데
        // 칼로리를 정수가 아닌 문자열로 kcal을 붙여 추출 후 메뉴이름: 000kcal로 반복 출력하고 싶다
        //익명클래스로 하려면 new Function<Dish, Object>(){}
//        List<SimpleDish> simpleDishes = menuList.stream().map(dish -> {
//            String name = dish.getName();
//            int calories = dish.getCalories();
//            SimpleDish sd = new SimpleDish(name, calories + "kcal");
//            return sd;
//        }).collect(Collectors.toList());
//            simpleDishes.forEach(sd -> System.out.println(sd));

//
//        List<SimpleDish> simpleDishes = menuList.stream().map(dish -> new SimpleDish(dish.getName(), dish.getCalories() + "kcal"))
//                .collect(Collectors.toList());
//        simpleDishes.forEach(sd -> System.out.println(sd));

        List<SimpleDish> simpleDishes = menuList.stream().map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList());
        simpleDishes.forEach(sd -> System.out.println(sd));




        /*
        * 메뉴 목록에서 칼로리가 500칼로리보다 큰 음식들을 필터링한 다음에
        * 음식의 이름과 타입만 추출해서
        * 출력해주세요
        * */
        menuList.stream()
                .filter(d -> d.getCalories() > 500)
                .map(d -> new DishNameType(d))
                .collect(Collectors.toList())
                .forEach(dnt -> System.out.println(dnt));


        //메뉴 목록에 있는 요리들의 총 칼로리수 구하기

        int totalCal = menuList.stream().mapToInt(d -> d.getCalories()) //int타입만 올 수 있음.
                .sum();
        System.out.println("totalCal = " + totalCal);

        //총 칼로리의 평균
        double averageCal = menuList.stream().mapToInt(d -> d.getCalories()).average().getAsDouble();
       //optionalDouble로 먼저 주는 이유는 0으로 나누게 될까봐. 안전장치를 걸어두는 것.

       //육류메뉴 평균 칼로리
        double meatAverageCal = menuList.stream().filter(d -> d.getType() == Dish.Type.MEAT).mapToInt(d -> d.getCalories()).average().getAsDouble();

    }

}
