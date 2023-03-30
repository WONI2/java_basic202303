package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String myName = "길동";
        String inputName = sc.nextLine();

        System.out.println("myName"+myName);
        System.out.println("inputName"+inputName);

        if(myName.equals(inputName)){ //기본타입을 제외하고는 equals로 비교하는 게 좋아요!
            System.out.println("두 이름이 일치");
        }else {
            System.out.println("두 이름이 다름");
        }

    }

}
