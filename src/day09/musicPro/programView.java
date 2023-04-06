package day09.musicPro;

import day04.array.StringList;
import day07.Util.Utility;
import java.util.Arrays;

import static day07.Util.Utility.input;

public class programView {

    static proRepository repository;

    public static void start() {
            showMenu();
        while(true) {
            selectNum();
        }
    }

    private static void showMenu() {
        System.out.println("****음악 관리 프로그램****");
//        등록된 가수 받아오기.
        int singer = repository.singer.length;
        System.out.printf("현재 등록된 가수 : %d명\n",singer);
        System.out.println("1. 노래 등록하기");
        System.out.println("2. 노래 정보 검색");
        System.out.println("3. 프로그램 종료");



    }


    private static void selectNum() {
        String selNum = input(">>");
        switch(selNum) {
            case "1" :
                listUp();
                break;
            case "2" :
                searchSinger();
                break;
            case "3" :
                System.exit(0);
                break;
            default:
                System.out.println("번호를 다시 입력해주세요");
        }
    }

    private static void searchSinger() {
        System.out.println("검색할 가수명을 입력하세요");
        String singerName = input("가수명 : ");
        singerStatus singerStatus = repository.searchSinger(singerName);

        if(singerStatus == singerStatus.NONE) {
            System.out.println("찾으시는 가수가 없습니다");
        }else{
            System.out.println(singerName+"님의 노래목록");
            String[] listOfSinger = Singer.songList;
            for (int i = 1; i < listOfSinger.length+1; i++) {
                System.out.println(i+"."+Arrays.toString(listOfSinger));
            }
        }




    }

    private static void listUp() {
        System.out.println("노래 등록을 시작합니다");
        String singerName = input("가수명 :");
        String songName = input("노래명 :");

        }
    }



