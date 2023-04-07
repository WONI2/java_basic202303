package day10.collection.set;

//집합 자료구조
//저장 순서를 보장하지 않음
//인덱스, 키를 사용하지 않아서 개별탐색이 불리함.
//저장값의 중복을 허용하지 않음

import day07.Util.Utility;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set<String> foodSet = new HashSet<>();

        //데이터추가 add(E e)
        foodSet.add("김밥");
        foodSet.add("순대");
        foodSet.add("떡볶이");
        foodSet.add("주먹밥");
        boolean flag1 = foodSet.add("오뎅");
        boolean flag2 = foodSet.add("오뎅");

        System.out.println(foodSet.size());
        System.out.println("foodSet = " + foodSet); //순서가 없이 나열됨

        System.out.println("flag1 = " + flag1); //true
        System.out.println("flag2 = " + flag2); //false

        Utility.makeLine();
        //인덱스가 없어서 fori는 사용 못하지만 iter는 사용 가능. get과 set도 당연히 불가.

        for (String s : foodSet) {
            System.out.println("s = " + s);
        }

        //remove(obj) : 삭제
        foodSet.remove("주먹밥");
        System.out.println("foodSet = " + foodSet);//foodSet = [김밥, 오뎅, 순대, 떡볶이]


        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5)
        );
        System.out.println("numbers = " + numbers);

        //리스트를 set으로 변환하면 중복없이 받을 수 있음
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);//numberSet = [1, 2, 3, 4, 5]



    }

}
