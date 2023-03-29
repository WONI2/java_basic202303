package Day03;

public class MethodBasic {

    //함수 : 코드블록의 기능적 표현 ex) add(10,20)
    //메서드 : 객체의 동작 표현 ex) 계산기.add(10,20)


    //자바는 모든 것을 객체로 표현, 함수마저도 모두 메서드로 처리.
    //자바의 메서드는 클래스 내부에서만 선언이 가능.
    //다른 메서드 안에서 선언할 수 없음(중첩함수 불가)
    
    //2개의 정수를 더해서 리턴하는 메서드
     static int add(int n1, int n2) {
         // 리턴하는데이터의타입 함수명()
         return n1 + n2; 
     }
     
     //return 값이 없는 함수. 값을 가지고 나가는 것은 안됨.
    static void makeLine() {
        System.out.println("=============");
    }
    //여러 값을 리턴 하고 싶은 경우.
    //2개의 정수를 전달하면 덧셈, 뺄셈, 곱셈 결과를 리턴하고 싶다면
    static int[] operatorAll(int number1, int n2) { //호출시에도 배열로 불러야. 이름전체 바꾸기 shift+f6
//         int[] results = {
//                 number1+n2,
//                 number1-n2,
//                 number1*n2
//         };
//         return results;
//

        return new int[]{
                number1 + n2,
                number1 - n2,
                number1 * n2

        };
         //여러개를 리턴하고 싶을 때는 하나로 묶어서 리턴해야 함.
         //로 가능. 다시 위로 바꿀 때 ctrl + alt + v 로 바꿀 수 있음
        //다시 돌아올 때는 ctrl + alt + n
    }

    //n개의 정수를 전달받아서 총합을 리턴
     static int addAll(int[] numbers)  {
         //int... numbers 로 작성하면, 묶어서 입력하지 않아도 나열한 값을 묶엇 전달해줌
         int total = 0;
         for (int number : numbers) {
             total += number;
         }
         return total;
     }

     //2개의 정수배열을 전달받아
    //들어있는 숫자의 개수가 더 많은 배열을 리턴하는 메서드
    static int[] compareNumbers(int[] arr1, int[] arr2) {
         /*if(arr1.length > arr2.length){
             return arr1;
         }else {
             return arr2;
         }*/
        //alt + enter 로 삼항연산자로 바꾸기.
        return arr1.length > arr2.length ? arr1 : arr2;
    }


    public static void main(String[] args) {
            
        int result = add(10, 20);
        System.out.println("result = " + result);

        makeLine(); //void 함수는 단독 호출. 다른 함수에 넣을 수는 없음. 

        int i = addAll(new int[]{10, 20, 50});
        System.out.println("i = " + i);

    }
}
