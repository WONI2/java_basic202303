package day13;

import day07.Util.Utility;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day07.Util.Utility.*;
import static day13.Dish.Type.*;
import static day13.Menu.menuList;
import static java.util.stream.Collectors.*;

public class Filtering {

    public static void main(String[] args) {

        //stream의 filter 조건에 맞는 데이터들을 필터링

        //메뉴 목록 중에 채식주의자가 먹을 수 있는 요리를 알려주세요
        //메뉴 리스트를 객체화로 만들어서 for문으로 출력할 수 있게 만들 것.
        List<Dish> filteredList = menuList.stream().filter(
           dish->  dish.isVegeterian()
//               return  dish.getType() == Dish.Type.MEAT
        ).collect(toList()); //Collectors가 대문자로 시작했기 때문에 class 임을 알 수 있다

        System.out.println("==채식주의자 요리 목록==");
//        for (Dish dish : filteredList) {
//            System.out.println(dish);
//        }

        filteredList.forEach(dish -> System.out.println(dish));

        //메뉴목록중에 육류이면서 600칼로리 미만인 요리 필터링

        makeLine();

        menuList.stream().filter(d -> d.getType() == MEAT && d.getCalories() < 600)
                .collect(toList()).forEach(d -> System.out.println(d));


        makeLine();
        System.out.println("요리의 이름이 4글자인 것 필터링");
        menuList.stream().filter(d-> d.getName().length() == 4)
                .collect(toList()).forEach(d -> System.out.println(d));

        makeLine();
        //원하는 개수만 필터링하기.
        //칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        //collector로 수집하기 전에 limit으로 제한을 걸어 줌
        menuList.stream().filter(d->d.getCalories() >300).limit(3) //앞에서부터 3개 추출. 정렬을 먼저 해두고 하는 게 좋지
                .collect(toList()).forEach(dish -> System.out.println(dish));


        makeLine();
        //칼로리가 300칼로리보다 높은 요리 중 처음 2개는 제끼고 필터링
        menuList.stream().filter(d->d.getCalories() >300).skip(2) //앞에 2개 빼고 추출.
                // 정렬을 먼저 해두고 하는 게 좋지
                .limit(3).collect(toList()).forEach(dish -> System.out.println(dish)); //limit으로 2개 제외하고 3개 추출

        makeLine();
        System.out.println("메뉴 목록에서 처음 등징하는 2개의 고기요리를 필터링 해서 리스트에 반환");
        List<Dish> dishes = menuList.stream().filter(dish -> dish.getType() == MEAT).limit(2).collect(toList());

            System.out.println(dishes);

        makeLine();
        //List에서 중복제거
        List<Integer> numbers = List.of(1, 1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8);

        List<Integer> distinctedList = numbers.stream().distinct() //중복제거
                .collect(toList());
        System.out.println(distinctedList);

        //list에서 짝수만 걸러 낸 뒤 중복제거
        List<Integer> distinctedNumberEven = numbers.stream().filter(n -> n % 2 == 0).distinct().collect(toList());
        System.out.println(distinctedNumberEven);



    }

}
