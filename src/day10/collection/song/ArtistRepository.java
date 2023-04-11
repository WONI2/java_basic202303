package day10.collection.song;

import day04.array.StringList;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArtistRepository {
    //key : 가수이름, value: 가수 객체
    private static Map<String, Artist> artistList;
    // key는 중복이 없는 정보로 만들어야 함. 중복이 되면 안돼!

    static {
        artistList = new HashMap<>();
    }

    // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addFirstArtist(String artistName, String songName) {
//        Artist artist = new Artist();
        Artist artist = new Artist(artistName, new HashSet<>());
        artist.getSongList().add(songName);
        artistList.put(artist.getName(), artist);

        //세이브 파일에 자동저장.
        autoSave();

//        artist.setSongList(new StringList());
//        artist.getSongList().push(songName);
    }

    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String artistName) {

        return artistList.containsKey(artistName);
    }

    // 가수명을 통해 가수 객체 정보를 반환하는 기능
    public Artist findArtistByName(String artistName) {

        return artistList.get(artistName);
    }

    // 기존 가수 객체에 노래를 추가하는 기능
    public boolean addNewSong(String artistName, String songName) {
        Artist artist = findArtistByName(artistName);
        boolean flag = artist.getSongList().add(songName);
        if(flag) autoSave();
        return flag;
        //****리팩터링해보기!

    }

    // 특정 가수의 노래목록을 반환하는 기능
    public Set<String> getSongList(String artistName) {

        return findArtistByName(artistName).getSongList();
    }

    // 등록된 가수의 수 반환
    public int count() {
        return artistList.size();
    }


    //자동 세이브 기능
    public void autoSave() {

        File f = new File("D:/MUSIC");
        if(!f.exists()) f.mkdir();

        try(ObjectOutputStream oos
                    = new ObjectOutputStream(new FileOutputStream("D:/MUSIC/m.sav"))) {
            oos.writeObject(artistList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //자동 로드 기능
    public static void loadFile() {

        //save 파일이 존재 한다면 load하는 것
        File f = new File("D:/MUSIC/m.sav");
        if(f.exists()) {
            //로드 할 것
            try(ObjectInputStream ois =
                    new ObjectInputStream((new FileInputStream(f)))) {

                artistList = (Map<String, Artist>) ois.readObject();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

