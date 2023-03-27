package day01;

public class Scope {

    public static void main(String[] args) {

        // 자바는 블록단위 스코프를 가짐.
        int n1 = 10;
        int n2 = 20; // main 블록에서 생성된 변수. 이 블럭을 벗어나면 쓰일 수 없음.

        if(true) {
            int n3 = n1 + n2;
            System.out.println(n3);
        }// end if

        for(int i = 0; i< 10 ; i++ ) {
            System.out.println(i);
            //i가 밖에서 선언되지 않았기 때문에 안에서만 사용 가능.
            // js에서는 안에서만 사용되는 변수이름을 같은 것을 사용 가능했지만(가장 가까운 변수를 사용하기 때문에), java에서는 불가능.
        }


    } //main이 끝나는 블록
}
