package day11.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputExample {

    public static void main(String[] args) {

        String msg = "멍멍이는 멍멍\n왈왈";

        //데이터를 외부로 내보낼 때 출력 스트림
        //그냥 Outputstream은 new을 쓸 수 없기 때문에 그의 자식클래스를 이용.
         //객체 생성을 try의 괄호 안에서 하면 자동 close를 생성하게 해줌.
        try(FileOutputStream fos
                    = new FileOutputStream("D:/exercise/dog.txt");) {
            fos.write(msg.getBytes());//string을 byte배열로 변환해주는 메서드를 사용
            System.out.println("파일저장처리에 성공!");

        } catch (FileNotFoundException e) {
            System.out.println("파일저장처리에 실패!");
        } catch (IOException e) {
            System.out.println("출력 시스템에 문제가 생겼습니다");
        }


        /*finally {
            try {
                if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


    }
}
