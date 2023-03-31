package day05.member;



//회원저장소역할
public class MemberRepository {
    Member[] memberList;
    Member member;

    public MemberRepository() {
        this.memberList = new Member[3];
        memberList[0] = new Member("Banana", "123@asd.com", "1234", 3333, Gender.FEMALE, 11);
        memberList[1] = new Member("Apple", "456@asd.com", "1234", 45678, Gender.MALE, 11);
        memberList[2] = new Member("Orange", "789@asd.com", "5678", 987, Gender.FEMALE, 11);
    }

    /*모든 회원 정보를 출력해주는 메서드 */

    void showMembers() {
        System.out.printf("===현재회원정보(총 %d 명)===\n", memberList.length);
        for (Member m: memberList) {
            System.out.println(m.inform());

        }
    }

    /*회원가입 기능
    * @param - newMember : 새롭게 회원가입하는 회원의 정보
    * @return - 회원가입 성공여부, 성공시 true, 이메일이 중복되어 실패시 false
    *  */
   boolean addMember(Member newMember) {

        /*이메일 중복 확인*/
       if(isDuplicateEmail(newMember.email)) return false;

//        실제로 멤버를 추가하는 코드
        Member[] temp = new Member[memberList.length+1];
        for (int i = 0; i < memberList.length; i++) {
                temp[i] = memberList[i];
        }
            temp[temp.length-1] = newMember;
            memberList = temp;

        return true;
    }

    /*
    * 이메일의 중복여부를 확인하는 기능
    * @param1 targetEmail : 검사 대상 이메일
    * @return : 중복시 true, 사용가능시 false
    * */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if(targetEmail.equals(m.email)){
                return true;
            }
        }
        return false;
    }

//마지막 회원의 번호를 알려주는 기능
    int getLastMemberId() {
        return memberList[memberList.length-1].memberId;
    }


    /*
    * 이메일을 통해 특정회원 객체를찾아서 반환하는 기능
    * 찾은 회원 리턴.
    * @param email : 찾고 싶은 회원의 이메일
    * @return : 찾은 회원의 객체 정보, 못찾으면 null 반환.
    * */
    Member findByEmail(String email) {
        for (Member m : memberList) {
            if (email.equals(m.email)) {
                return m;
            }
        }
        return null;
    }
}
