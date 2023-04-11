package day12.inner;


//계산 기능을 명세
//두 개의 정수를 상황에 맞게 연산할 수 있다
// 람다 사용이 가능한지 체크 : 추상 메서드가 1개인 경우.

@FunctionalInterface //붙였을 때 에러가 안나면 람다를 사용할 수 있음

public interface Calculator {

    int operate(int n1, int n2);



}
