package day09.musicPro;

public class Singer {
    static String name;
    static String[] songList;
    String song;

    static {
        songList = new String[0];
    }

    public Singer(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
