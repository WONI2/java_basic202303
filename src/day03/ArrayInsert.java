package day03;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        //25를 20과 30 사이에 넣고 싶다
        int targetIndex = 3;
        int newData = 25; //2번 인덱스에 넣어야 함

        System.out.println("추가 전 :"+Arrays.toString(arr));
        //1. 배열의 사이즈를 먼저 늘려 놓을 것.
         int[] temp = new int[arr.length+1];
        //2. 원본배열을 다 복사해두기. 마지막 칸이 비어있음
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        //3. 마지막 칸부터 타겟 인덱스까지 한 칸씩 뒤로 밀어
        for (int i = temp.length-1; i > targetIndex ; i--) {
            temp[i] = temp[i-1];
        }


        //4. 타겟 인덱스 자리에 새 데이터를 넣는다.
            temp[targetIndex] = newData;

        //5. 주소를 바꾼다
            arr = temp;
            temp = null;

        System.out.println("추가 후 :"+Arrays.toString(arr));




    }
}
