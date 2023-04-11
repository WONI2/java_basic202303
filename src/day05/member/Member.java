package day05.member;

public class Member {
    public String memberName;
    public String email;
    public String password;
    public int memberId;
    public Gender gender;
    public int age;



    public Member(String memberName,String email, String password, int memberId, Gender gender, int age) {
       this.memberName = memberName;
        this.email = email;
        this.password = password;
        this.memberId = memberId;
        this.gender = gender;
        this.age = age;


    }

    //회원정보를 문자열로 만들어서 리턴하는 메서드

    String inform() {
        String convertGender = (gender == Gender.MALE) ? "남성" : "여성";

        return String.format("%d번 | %s | %s| %s | %d세" , this.memberId, this.memberName, this.email, this.gender, this.age);


    }




}
