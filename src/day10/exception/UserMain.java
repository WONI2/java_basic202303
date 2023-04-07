package day10.exception;

public class UserMain {

    public static void main(String[] args) {
        LoginUser user = new LoginUser("abcabc","1234");

        try {
            user.loginValidate("abcabc","1234");
        } catch (Exception e) {
//            e.getMessage() : 에러원인 메시지를 리턴받아옴. throw에서 작성해둔 메세지.
            System.out.println(e.getMessage());
        }

    }
}
