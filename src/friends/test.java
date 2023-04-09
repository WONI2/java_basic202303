package friends;

import java.util.List;

public class test {

    public static void main(String[] args) {
        People kim = new People("김철수");
        People LEE = new People("이순신");
        People hong = new People("홍길동");

        kim.addFollowerWaitList(LEE);
        kim.addFollowerWaitList(hong);

        kim.addFollower(LEE);


        List<String> kimWaitList = kim.showFollowerWaitPerson();
        System.out.println("kimWaitList = " + kimWaitList);

        List<String> followerNames = kim.showFollower();
        System.out.println("followerNames = " + followerNames);

        List<String> followerNamesLEE = LEE.showFollower();
        System.out.println("followerNamesLEE = " + followerNamesLEE);

    }
}
