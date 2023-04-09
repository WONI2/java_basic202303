package day10.collection.list;

import day07.Util.Utility;

import java.util.*;

/*
* 저장데이터의 순서를 보장.
* 인덱스를 가지고 있음
* 중복 데이터 저장 가능
*
* */
public class ListExample {
    public static void main(String[] args) {

        List<String> foodList = new ArrayList<>(); //다형성을 위해 List로 받아주는 게 좋음

        // add(E e). ArrayList는 기본적으로 10칸의 배열씩 준비 됨. 끝에 추가
        foodList.add("보쌈");
        foodList.add("짜장면");
        foodList.add("닭강정");

        System.out.println("add"+foodList);

//        add(index, element) : 중간 삽입
        foodList.add(2,"김밥");

//        size() : 저장된 데이터 개수를 반환
        int size = foodList.size();
        System.out.println("size = " + size);

        System.out.println(foodList); //println 은 toString을 포함하고..

//        indexOf(E e) :해당 데이터의 인덱스 반환
        int index = foodList.indexOf("닭강정");
        System.out.println("index = " + index);


//        contains(E e) : 해당 데이터 저장 유무 확인
        System.out.println(foodList.contains("보쌈"));
    
//    remove(index), remove(obj)
        String remove = foodList.remove(0);//인덱스로 지우면 지운 데이터를 추출해줌
        System.out.println(foodList);
        System.out.println("remove = " + remove);


//        set(index, newElement) : 수정
        foodList.set(0,"깐풍기");
        System.out.println(foodList);
        
//        get(index) : 리스트에 저장된 데이터 참조
        String s = foodList.get(1);
        System.out.println("s = " + s);

        Utility.makeLine();
//     반복문 처리
        for (int i = 0; i < foodList.size() ; i++) {
            System.out.println("fori-food"+foodList.get(i));
        }

        for (String food : foodList) {
            System.out.println("iter-food = " + food);
        }

//        clear() : 내부 데이터 전체삭제
        foodList.clear();

        System.out.println(foodList);
        System.out.println(foodList.isEmpty());


        //리스트에 초기값 넣고 시작하기
        List<String> BTS = new ArrayList<>(
                Arrays.asList("정국", "V")

                );
        System.out.println("BTS = " + BTS);


      Utility.makeLine();
    //정렬 (듀얼 피벗 퀵 정렬)
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10,4,2,55,67,90)
        );
        System.out.println("정렬 전 numbers = " + numbers);

        //오름차정렬
        Collections.sort(numbers);
        System.out.println("오름차정렬 numbers = " + numbers);


        //내림차정렬.
        numbers.sort(Comparator.reverseOrder());
        System.out.println("내림차정렬 numbers = " + numbers);
    }
}
