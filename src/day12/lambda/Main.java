package day12.lambda;

import day05.member.Gender;
import day05.member.Member;
import day07.Util.Utility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day07.Util.Utility.*;
import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.*;

public class Main {
    public static void main(String[] args) {
        //사과 바구니 생성
        List<Apple> appleBasket = List.of(
            new Apple(80, GREEN)
            , new Apple(75, RED)
            , new Apple(90, YELLOW)
            , new Apple(70, RED)
            , new Apple(85, RED)
            , new Apple(90, YELLOW)
            , new Apple(85, GREEN)
            , new Apple(120, GREEN)


        );

        System.out.println("**녹색사과 필터링**");
        List<Apple> greenApples = filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("**노란사과 필터링**");
        List<Apple> colorApples = filterApplesByColor(appleBasket, YELLOW);

        for (Apple ca : colorApples) {
            System.out.println(ca);
        }

        System.out.println("======원하는 조건으로 필터링======");

        //100g 이하 사과들
        List<Apple> filterApples
                = filterApples(appleBasket, new LightApplePredicate());// 객체 안에 함수를 전달한 것
        for (Apple filterApple : filterApples) {
            System.out.println(filterApple);
        }
        makeLine();
        //빨간 사과 필터링
//        List<Apple> apples1 = filterApples(appleBasket, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor() == RED;
//            }
//        });
        //빨간 사과 필터링-> 람다식으로 변환
        List<Apple> apples1 = filterApples(appleBasket, apple -> apple.getColor() == RED);

        for (Apple apple : apples1) {
            System.out.println("REDapple = " + apple);
        }

        makeLine();

        //녹색이면서 100g보다 큰 사과만 필터링
        List<Apple> apples2 = filterApples(appleBasket, apple -> apple.getColor() == GREEN && apple.getWeight() >= 100);

        for (Apple apple : apples2) {
            System.out.println("GREEN&UP100 apple = " + apple);
        }

        filter(appleBasket, apple -> apple.getWeight() >= 80 && apple.getWeight()<=100);


        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        List<Integer> filter = filter(numbers, n -> n % 2 == 0);
        System.out.println("filter = " + filter);


        List<String> wordList = List.of("hey", "hi", "hello","aaaaaa");
        List<String> filter1 = filter(wordList, w -> w.length() == 2);
        System.out.println("filter1 = " + filter1);

        List<String> filter3
                = wordList.stream().filter(w -> w.length() < 5).collect(Collectors.toList());

        System.out.println("filter3 = " + filter3);


        makeLine();

        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);


        //회원정보에서 회원의 나이만 추출
        List<Member> memberList =List.of(
                new Member("kim","aaa@bbb.com","1234",1, Gender.MALE,11)
                ,new Member("lee","aa@bbb.com","1234",2, Gender.MALE,12)
                ,new Member("park","b@bbb.com","1234",3, Gender.FEMALE,13)
                ,new Member("song","bbb@bbb.com","1234",4, Gender.MALE,14)
                ,new Member("kim","bbbbb@bbb.com","1234",5, Gender.MALE,15)
                ,new Member("kim","bbbbbbb@bbb.com","1234",6, Gender.FEMALE,16)
        );
        List<Integer> nameList
                = map (memberList, m-> m.age);

    }
}
