package day04;

public class FieldMain {
    public static void main(String[] args) {

        FieldAndLocal fl = new FieldAndLocal();
        System.out.println(fl.a);//0. a의 기본값이 0이기 때문

        fl.a = 99;
        fl.mm(100); //a값이 99로 변경
    }

}
