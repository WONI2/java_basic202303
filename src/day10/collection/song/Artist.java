package day10.collection.song;

import day04.array.StringList;

import java.io.Serializable;
import java.util.Set;

public class Artist implements Serializable {

    private String name;  // 가수 이름
    private Set<String> songList; // 노래 목록

    public Artist() {
    }

    public Artist(String name, Set<String> songList) {
        this.name = name;
        this.songList = songList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }
}
/*
// 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
public void addNewArtist(String artistName, String songName) {
//        // 1. 가수 객체 생성
//        Artist artist = new Artist();
//
//        // 2. 생성된 가수 객체에 전달받은 이름 셋팅
//        artist.setName(artistName);
//
//        // 3. 생성된 가수 객체에 노래 목록 생성해서 셋팅
//        artist.setSongList(new StringList());
//
//        // 4. 해당 노래목록에 전달받은 노래 추가
//        artist.getSongList().push(songName);

        Artist artist = new Artist(artistName, new StringList(songName));

        // 5. 가수배열에 해당 가수 객체 추가
        Artist[] temp = new Artist[artistList.length + 1];
        for (int i = 0; i < artistList.length; i++) {
        temp[i] = artistList[i];
        }
        temp[temp.length - 1] = artist;
        artistList = temp;
        }
*
*
* */