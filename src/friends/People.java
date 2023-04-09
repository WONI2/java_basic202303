package friends;


import java.util.ArrayList;
import java.util.List;

//한 명의 사람
public class People {

    private String nickName;

    //팔로워 목록
    private List<People> followers;

    //팔로워 대기 목록
    private List<People> followerWaitList;

    //팔로잉 목록
    private List<People> followings;

    //생성자

    public People(String nickName) {
        this.nickName =nickName;
        this.followers= new ArrayList<>();
        this.followings= new ArrayList<>();
        this.followerWaitList= new ArrayList<>();
    }

    //팔로워 대기 목록에 팔로우요청한 사람을 추가하는 기능
    public void addFollowerWaitList(People requestPerson) {
        this.followerWaitList.add(requestPerson);

    }
    //팔로워 목록에 팔로우수락한 사람을 추가하는 기능
    public void addFollower(People requestPerson) {
        //내 팔로워 목록에 상대방 추가
        this.followers.add(requestPerson);
        //내 팔로워 대기목록에서 상대방 삭제
        this.followerWaitList.remove(requestPerson);
        //상대방의 팔로잉 목록에 나를 추가
        requestPerson.followers.add(this);

    }

    //팔로워 대기 목록에서 닉네임을 보여주는 기능
    public List<String> showFollowerWaitPerson() {
        //팔로워대기목록 사람들 이름만 저장할 리스트

        List<String> waitListNames = new ArrayList<>();
        for (People people : followerWaitList) {
            waitListNames.add(people.nickName);

        }
        return waitListNames;
    }
    //팔로워 대기 목록에서 닉네임을 보여주는 기능
    public List<String> showFollower() {
        //팔로워대기목록 사람들 이름만 저장할 리스트

        List<String> waitListNames = new ArrayList<>();
        for (People people : followers) {
            waitListNames.add(people.nickName);

        }
        return waitListNames;
    }

}
