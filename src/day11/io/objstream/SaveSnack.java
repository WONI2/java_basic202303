package day11.io.objstream;

import day11.io.rw.Path;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveSnack {
    private static List<Snack> snacklist = new ArrayList<>();

    public static void main(String[] args) {
        snacklist.add(new Snack("새우깡", "1970", 1500, Snack.Taste.GOOD));
        snacklist.add(new Snack("빼빼로", "1980", 1500, Snack.Taste.GOOD));
        snacklist.add(new Snack("버터링", "1990", 1800, Snack.Taste.BAD));

        saveTextFile();
        saveFile();

    }


    //텍스트파일로 리스트 데이터 저장
    private static void saveTextFile() {
        try(FileWriter fw =new FileWriter(Path.ROOT_PATH+"/snack.txt")){

            for (Snack s : snacklist) {
                fw.write(String.format("%s,%s,%d,%s\r\n",s.getSnackName(),
                        s.getYear(),s.getPrice(),s.getTaste()));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //객체를 통으로 파일에 저장
    private  static void saveFile() {
        try(FileOutputStream fos
                    = new FileOutputStream(Path.ROOT_PATH+"/snack.sav")) {
            //객체 저장을 위한 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snacklist);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
