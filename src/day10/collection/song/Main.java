package day10.collection.song;

public class Main {

    public static void main(String[] args) {

        //세이브파일을 자동로드 하고 시작하도록 만들기.
        ArtistRepository.loadFile();

        ArtistView.start();

    }
}
