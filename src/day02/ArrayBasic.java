package day02;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {
        //배열 객체 생성

        //배열은 동종모음 구조. 이종모음구조로 변경 가능.(객체를 더 잘 이해해야.)
        int[] arr = new int[5]; //int[] 8바이트 할당. 주소를 담는 것은 8바이트를 가짐
        System.out.println("arr = " + arr); //arr = [I@6bf256fa 주소값이 담겨 있음
        //[I : int 배열, @ : ~에

        arr[0] = 50;
        arr[1] = 77;
        arr[2] = arr[0] +20;
        arr[3] = (int) 66.7;
        arr[4] = 100;

        //배열의 길이 - 저장 데이터 개수
        //자바의 배열은 immutable(불변성), 공간이 없는데 데이터를 새로 추가하면 런타임 에러.
        System.out.printf("배열의 길이 : %d\n",arr.length);

    //배열 반복문 처리 /*fori*/
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번 데이터 : %d\n",i+1,arr[i]);
        }

        System.out.println("==================================");
    //foreach문   /*iter*/ alt+enter로 눌러서 for문과 foreach문 사이 등 변경 가능
        for(int n : arr ) {
            System.out.printf("데이터 : %d\n",n);
        }

        //배열 내부데이터 문자열로 출력
        System.out.println(Arrays.toString(arr));


    }
}
