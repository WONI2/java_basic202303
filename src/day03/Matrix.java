package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        //1차원 배열이 너무 많을 때, int[] 을 한번더 묶어서 2차원 배열을 만든다

        int[] kim ={10,20,30};
        int[] park ={40,50,60};
        int[] choi ={70,80,90};

        //2차원 배열 -> 1차원 배열의 주소들을 배열에 저장해둔 것
         int[][] classScores ={kim, park, choi};
        System.out.println(classScores);//[[I@48140564 주소값을 가지고 있는 것 .
        System.out.println(classScores[0]); //1차원 배열의 주소값이 출력 [I@48140564. kim의 주소도 같음
        System.out.println(kim[0]); // int 인 10이 출력
        System.out.println(classScores[0][0]); //int인 10이 출력. 즉 classScores[0] 의 [0]값 10이 출력

        System.out.println(Arrays.toString(classScores) ); // 각각 kim park choi 의 주소값이 나옴
        //[[I@58ceff1, [I@7c30a502, [I@49e4cb85]

        System.out.println(Arrays.deepToString(classScores));
        //deepToString : [[10, 20, 30], [40, 50, 60], [70, 80, 90]] 배열의 주소가 아닌 내용을 보여줌


        //2차원 배열의 값 초기화

        int[][] arr2d = {
                {10,20,30},
                {40,50,60},
                {70,80},
                {100,200,300}
        };
        //60에 접근하기
        System.out.println(arr2d[1][2]);
        int[] arr3 =arr2d[2];


        //2차원 배열의 순회
        for (int[] arr : arr2d) {
            for ( int n : arr) {
                System.out.printf("%3d ",n); //%3d : 3칸을 차지하게 만듦. 줄을 맞춰줄 수 있음
            }
            System.out.println();
        }
        System.out.println("=====================");

        //배열의 기본값
        //정수배열은 0이 기본값, 실수는 0.0이 기본값. null이 아님.
        //논리는 false가 기본, 그 나머지는 전부 null이 기본
        //char 배열은 기본값 공백
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));//

        boolean[] booleans = new boolean[5];
        System.out.println(Arrays.toString(booleans));//[false, false, false, false, false]

        String[] strings = new String[5];
        System.out.println(Arrays.toString(strings));//[null, null, null, null, null]

        char[] chars = new char[5];
        System.out.println(Arrays.toString(chars));//[ ,  ,  ,  ,  ]




        //5행 4열의 정수 2차원 배열을 생성만 하고 싶다
        int[][] arrays = new int[5][4];
       // System.out.println(Arrays.toString(arrays));


        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf("%3d",i);
            }
            System.out.println();
        }
        System.out.println("=====================");

    //2차원 배열의 수정
        arrays[1][3] = 10;
        arrays[2][1] = 55;
                                            //ctrl + E :최근에 열어본 목록
// 선언과 동시에 초기호한다면 new Type[] 생략가능. 이외의 상황에서는 불가. 따라서 NEW INT[] 붙여야
        arrays[3] = new int[] {9, 8, 7, 6};

    //수정 후 출력
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf("%3d",i);
            }
            System.out.println();
        }


//3차원 배열
     int[][][]  arr3d = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                },
                {
                        {9, 10},
                        {11, 12}
                },
        };
        System.out.println(arr3d[1][0][1]); //6


    }
}
