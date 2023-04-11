package day11.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("D:/exercise/동물이름.txt")) {

            String s = "거북이는 꼬북이 \n ";
            fw.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
