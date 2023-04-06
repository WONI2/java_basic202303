package day09.song;

import day04.array.StringList;

public class ArtistRepository {
    private static Artist[] artistList; // 가수 배열

    static {
        artistList = new Artist[0];
    }

    // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addFirstArtist(String artistName, String songName) {
//        Artist artist = new Artist();
        Artist artist = new Artist(artistName, new StringList(songName));
        artist.setName(artistName);

        artist.setSongList(new StringList());
        artist.getSongList().push(songName);
    }
    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String artistName) {
        return false;
    }
    // 가수명을 통해 가수 객체 정보를 반환하는 기능
    public Artist findArtistByName(String artistName) {
        for (Artist artist : artistList) {
            if (artistName.equals(artist.getName())) {
                return artist;
            }
        }
        return null;
    }

    // 기존 가수 객체에 노래를 추가하는 기능
    public boolean addNewSong(String artistName, String songName) {
        //1. 기존 가수정보를 불러온다
        Artist foundArtist = findArtistByName(artistName);

        //2. 그 가수 객체에서 노래 목록을 빼온다
        StringList songList = foundArtist.getSongList();
        //3. 그 노래목록에 새 노래를 추가한다
        if(!songList.includes(songName)){
            songList.push(songName);
            return true;
        }
        return false;
    }
    // 특정 가수의 노래목록을 반환하는 기능
    public String[] getSongList(String artistName) {

        return findArtistByName(artistName).getSongList().getsArr();
    }
    // 등록된 가수의 수 반환
    public int count() {
        return artistList.length;
    }


}

