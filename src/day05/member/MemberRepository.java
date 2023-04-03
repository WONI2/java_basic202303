package day05.member;



//회원저장소역할
public class MemberRepository {

    public static final int NOT_FOUND = -1;
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
        return !isEmpty()? memberList[memberList.length-1].memberId : 0;
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

    /*
    * 이메일을 통해 저장된 회원의 인덱스값을 알아내는 메서드
    * @param email : 탐색 대상의 이메일
    * @return : 찾아낸 인덱스, 못찾으면 -1
    *
    * */


    int findIndexByEmail(String email) {
        for (int i = 0; i < memberList.length; i++) {
                if(memberList[i].email.equals(email))
                    return i;
        }
        return NOT_FOUND;
    }



    /*비밀번호 수정하는 기능
    *@param email : 수정대상의 이메일
    *@paeam newPassword : 변경할 새로운 비밀번호
    */

    boolean changePassword(String email, String newPassword) {

        //인덱스 탐색
        int index = findIndexByEmail(email);
        //수정진행
        if(index == NOT_FOUND) return false;
        memberList[index].password = newPassword;
        return true;


    }

    void removeMember(String email) {
        //인덱스 찾기
         int index = findIndexByEmail(email);

        //앞으로 가져오기
        for (int i = index; i < memberList.length-1; i++) {
            memberList[i] = memberList[i+1];
        }
        //배열 마지막칸 없애기
         Member[] temp = new Member[memberList.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
        temp = null;
    }


    boolean isEmpty() {
        return memberList.length == 0; ///java에서 0이 false인가?
    }







}
