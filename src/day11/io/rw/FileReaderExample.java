package day11.io.rw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader(Path.ROOT_PATH + "/동물이름.txt")) {

            //버퍼스트림. 메인스트림을 만들고 버퍼를 붙여주는 방식으로 만들 것.
            BufferedReader br = new BufferedReader(fr);
            String s =br.readLine();
            System.out.println("s = " + s);


//            fr.read()
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
