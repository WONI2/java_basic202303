package day10.exception;

public class FinallyExample {

    public static void main(String[] args) {
        String[] pets = {"고슴도치", "거북이", "앵무새"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i]+"키우고싶어");

            } catch (Exception e) {
                System.out.println("애완동물 정보가 없습니다");
            }finally { // 예외와 관계없이 항상 실행할 코드. try/catch의 optional.
                //try, catch 둘 중 하나만 실행되도 언제나 실행됨.

                //보통 DB 접속 후 다음접속을 위해 DB연결을 종료 시켜야 할 경우 사용
                System.out.println("dob");
            }
        }

        System.out.println("프로그램 정상 종료");
    }
}
