package day10.collection.song;

import java.util.Set;

import static day07.Util.Utility.input;
import static day07.Util.Utility.makeLine;

public class ArtistView {
    private final static ArtistRepository ar;
    //프로그램을 안전하게 만들기 위해 final 추가

    static {
        ar = new ArtistRepository();

    }

    //메인 실행기능
    public static void start() {


        while (true) {
            System.out.printf("현재 등록된 가수 : %d명 ", ar.count());
            System.out.println("1. 노래 등록하기");
            System.out.println("2. 노래 정보 검색");
            System.out.println("3. 프로그램 종료");
            makeLine();

            String selNum = input(">>");
            switch(selNum) {
                case "1" :
                    insertProcess();
                    break;
                case "2" :
                   searchProcess();
                    break;
                case "3" :
                    System.exit(0);
                    break;
                default:
                    System.out.println("번호를 다시 입력해주세요");
            }



        }
    }

    private static void insertProcess() {
        System.out.println("\n노래등록을 시작합니다");
        String artistName = input("가수명 : ");
        String songName = input("노래명 : ");

        //신규가수인가?
        if(!ar.isRegistered(artistName)){
            ar.addFirstArtist(artistName,songName);
            System.out.println(artistName+"님이 신규 등록되었습니다");
        }else{ //기존가수인경우
           boolean flag = ar.addNewSong(artistName,songName);
            if(flag) {
                System.out.printf("\n%s님의 노래 목록에 %s곡이 등록되었습니다",artistName,songName);

            }else {
                System.out.printf("\n[%s]는 이미 등록된 곡입니다");
            }
        }

    }

    private static void searchProcess() {
        System.out.println("검색할 가수명을 입력하세요");
        String artistName = input("가수명 :");

        if(ar.isRegistered(artistName)) {
            //등록된 경우
            makeLine();
            Set<String> songList = ar.getSongList(artistName);
            int i = 0;
            for (String song : songList) {
                System.out.printf("%d . %s\n",i+1,song );
                i++;
            }
        }else {
            System.out.println("해당가수는 등록되지 않았습니다.");
        }
    }

}
