package day13;

import day07.Util.Utility;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day07.Util.Utility.*;
import static day13.Menu.menuList;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {
        //stream의 정렬 sorted

        //메뉴 목록 중 칼로리가 낮은 순으로 정렬
//        menuList.stream().sorted(new Comparator<Dish>() {
//            @Override
//            public int compare(Dish o1, Dish o2) {
//                return o1.getCalories()-o2.getCalories();
//            }
//        }).collect(Collectors.toList());

        menuList.stream().sorted(comparing(d -> d.getCalories())).collect(toList()); //오름차순
        makeLine();
        menuList.stream().sorted(comparing(d -> d.getCalories())).collect(toList()).forEach(d -> System.out.println(d)); //오름차


        makeLine();
        //내림차 정렬
        menuList.stream().sorted(Comparator.comparing(Dish::getName).reversed()).collect(toList()).forEach(d -> System.out.println(d)); //내림차


        makeLine();
        //원하는 개수만 필터링하기.
        //칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        //collector로 수집하기 전에 limit으로 제한을 걸어 줌
        List<Dish> caloriesListTop3 = menuList.stream().filter(d -> d.getCalories() > 300).sorted(comparing(dish -> dish.getCalories())).limit(3)
                .collect(toList());
        caloriesListTop3.forEach(d-> System.out.println(d));










    }
}
