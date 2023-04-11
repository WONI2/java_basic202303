package day12.lambda;

import java.util.ArrayList;
import java.util.List;

//사과를 여러 방법으로 필터링
public class FilterApple {


    /**
     * @solution - try1 : 사과바구니에서 녹색 사과만 필터링
     *
     * @problem
     * -만약에 다른 색의 사과를 필터링해야 한다면 새로운 메서드 필요
     *
     *
    *  @param1 basket : 여러 사과가 모여있는 바구니
     * @return : 녹색 사과들만 보여있는 바구니
    *
    * */
    public static List<Apple> filterGreenApples(List<Apple> basket) {
        //녹색 사과만 담을 바구니
        List<Apple> greenApples = new ArrayList<>();
        //반복문으로 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == Color.GREEN) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    /**
     * @solution : -try2 : 색상을 파라미터화
     * @problem :
     * -필터의 기준이 색상이 아니라 무게라면
     */

    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {

        List<Apple> filteredApples = new ArrayList<>();
        //반복문으로 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == color) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    /**
     * @solution -try3 : 동작을 파라미터화 한다. (ApplePredicate 인터페이스 타입의 객체를 받아옴)
     * (추상적 조건으로 필터링)
     * @problem
     * - 오렌지 바구니를 필터링 해야 한다면? or 전자제품 바구니를 필터링 해야 한다면?
     *
     */
//    걸러낸 사과들을 리턴 해준다.

    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate p) {
        List<Apple> filteredApples = new ArrayList<>();
        //반복문으로 필터링
        for (Apple apple : basket) {
            if(p.test(apple)) {
                //자바는 함수 안에 함수를 쓸 수 없음. 대신에 객체를 받아올 수 있음.
                // 객체가 추상메서드를 받아올 수 있기 때문에.
                //상황에 따라 메서드가 다른 추상메서드를 가져올 수 있음
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    /**
     * @solution -try4 : 제네릭 필터 메서드 생성
     *
     */
    public static <Type> List<Type> filter(List<Type> basket, GenericPredicate<Type> p) { //리턴타입앞에 제네릭 표시 필수
        List<Type> filterList = new ArrayList<>();
        for (Type type : basket) {
            if(p.test(type)) {
                filterList.add(type);
            }
        }
        return filterList;

    }


}
