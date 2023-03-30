package day03;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,11};
        System.out.println("삭제 전 : "+ Arrays.toString(arr));
        //3을 지우려고 할 때, 값을 앞 자리로 가져오고 마지막을 삭제.
       /* arr[1] = arr[2];
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5]; */
        //정규화
        int delIndex = 3;
        for (int i = delIndex; i <arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        //pop알고리즘으로 배열 끝자리 삭제

        int[] temp = new int[arr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] =arr[i];
        }
        arr =temp;
        temp = null;

        System.out.println("삭제 후 : "+ Arrays.toString(arr));


    }
}
