package day09.musicPro;

public class proRepository {

    static Singer[] singer = {
            new Singer("안녕"),
            new Singer("메롱")
    };

    public singerStatus searchSinger(String singerName) {
        for (int i = 0; i < singer.length; i++) {
            if (singerName.equals(Singer.getName())) {
                return singerStatus.REGISTERED_SINGER;
            }
        }
        return singerStatus.NONE;
    }
}