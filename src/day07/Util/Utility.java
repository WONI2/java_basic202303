package day07.Util;

import java.util.Scanner;

public class Utility {

    private static Scanner sc = new Scanner(System.in);

    private Utility() {
        //사용자의 혼란을 줄이도록 객체를 못만들도록 만들어 준다.
    }

    //구분선을 출력하는 기능
    public static void makeLine() {
        System.out.println("============================");
    }

    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

}
