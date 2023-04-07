package day10.exception;

public class LoginUser {

    String userAccount; //가입된 계정명
    String userPassword; // 가입시 설정한 패스워드

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    //로그인 검증
    public String loginValidate(String inputAccount, String inputPassword)
        throws Exception {

        //회원계정이 존재 하는가?
        if(userAccount.equals(inputAccount)) {
            //패스워드가 일치?
            if(userPassword.equals(inputPassword)){
                //로그인성공
                return "SUCCESS";
            }else{
                //패스워드가 틀림. 새로운 error를 발생시키는 것.
                throw new LoginValidateException("비밀번호가 다릅니다");
                //LoginValidateException클래스로 예외에 메세지를 넣도록 만들어 줬기 때문에.
                //디테일 처리를 위해 만들어 둠.
            }
        }else {
            //계정정보가 틀림
            throw new LoginValidateException("회원가입하세요");
        }
    }

}
