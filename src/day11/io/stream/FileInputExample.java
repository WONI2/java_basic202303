package day11.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {

        String path = "D:\\java_basic\\src\\day01\\Scope.java";

        try(FileInputStream fis = new FileInputStream(path)) {

            int data = 0;
            while(data != -1) { // 1 byte씩 읽기 때문에 while문을 이용함. 그래서 문자열을 받을 때는 사용하기 어려움.

                data = fis.read();
                System.out.write(data); //print가 아니라 write로 써줄 것
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
