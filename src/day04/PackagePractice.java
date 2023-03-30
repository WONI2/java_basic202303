package day04;

import fruit.Banana;
import fruit.Grape;

public class PackagePractice {

    public static void main(String[] args) {
        new juice.Apple(); //package.생성자 로 호출


        fruit.Banana banana = new fruit.Banana(); //fruit. 을 붙이지 않도록, import를 해주면 됨
        //import 하고 나면 앞쪽에 fruit.을 붙이지 않아도 됨
        //패키지는 소문자 작성. 클래스는 대문자 함께 작성


        new Grape();


    }
}
