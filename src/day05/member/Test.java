package day05.member;

public class Test {
    public static void main(String[] args) {
//        Member m1 = new Member("Banana", "123@asd.com", "1234", 3333, Gender.FEMALE,11 );
//        Member m2 = new Member("Apple", "456@asd.com", "1234", 45678, Gender.MALE,11 );
//        Member m3 = new Member("Orange", "789@asd.com", "5678", 987, Gender.FEMALE, 11);
//        System.out.println(m1.inform());

        MemberRepository mr = new MemberRepository();

        Member m4 = new Member("Grape", "112233@asd.com", "56789", 1212, Gender.MALE, 12);

        boolean flag = mr.isDuplicateEmail("789@asd.com");
        System.out.println("flag: " + flag);

        mr.addMember(m4);

        mr.addMember(m4);


        mr.showMembers();


        //수정테스트

        String targetEmail = "789@asd.com";
        boolean updateFlag
           = mr.changePassword(targetEmail, "1111");

        if(updateFlag) {
            Member updateMember = mr.findByEmail(targetEmail);
            System.out.println("updateMember =" + updateMember.password);
        }else {
            System.out.println("이메일이 잘못됨");
        }

        System.out.println("==========================");
        mr.showMembers();
        mr.removeMember("789@asd.com");

        mr.showMembers();



    }




}
