package day02;

import java.util.Arrays;

//public class ArrayPop {
//    public static void pop() {
//        if (arr.length > 0) {
//            // 0. 삭제 대상 데이터 백업
//            int delTarget = arr[arr.length - 1];
//
//            // 1. 원본배열보다 1개 사이즈 작은 새 배열 생성
//            int[] temp = new int[arr.length - 1];
//
//            // 2. 맨 마지막 데이터만 빼고 모두 새배열에 복사
//            for (int i = 0; i < temp.length; i++) {
//                temp[i] = arr[i];
//            }
//            // 3. 주소값 이전
//            arr = temp;
//            temp = null;
//
//            return delTarget;
//        }
//        System.out.println("삭제 데이터 없음!");
//        return 0;
//
//
//    }
//    static int[] arr = {10, 20, 30, 40, 50};
//    public static void main(String[] args) {
////        //배열의 맨 끝 데이터 삭제
////        int[] arr = {10, 20, 30, 40, 50};
////
////        //1.원본 배열보다 1개 사이즈 작은 새 배열 생성
////         int[] arrCopy = new int[arr.length-1];
////
////        //2. 맨 마지막 데이터만 빼고 모두 새배열에 복사
////        for (int i = 0; i < arrCopy.length; i++) {
////            arrCopy[i] = arr[i];
////        }
////        //3. 주소값 이전
////        arr =arrCopy;
////        arrCopy = null;
////        System.out.println(Arrays.toString(arr));
////
////
//        System.out.println(Arrays.toString(arr));
//    }
//}
public class ArrayPop {

    public static void main(String[] args) {

        // 배열의 맨 끝 데이터 삭제
        int[] arr = {10, 20, 30, 40, 50};

        // 1. 원본배열보다 1개 사이즈 작은 새 배열 생성
        int[] temp = new int[arr.length - 1];

        // 2. 맨 마지막 데이터만 빼고 모두 새배열에 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 주소값 이전
        arr = temp; temp = null;

        System.out.println(Arrays.toString(arr));


    }
}