package day04;

//댄서의 설계도.
//설계도에는 main을 만들지 않음.
public class Dancer {

    //속성(필드)
    String dancerName;  //댄서 이름. 내용은 나중에 결정

    String crewName; //크루이름
    String genre; // 춤 장르

    DanceLevel level; //춤 수준(0: 초보, 1: 중수 2: 고수)

    //생성자 : 스카우터, 개발자 . 여러개의 생성자를 만들 수 있음
    //생성자도 함수개념, 리턴이 주소값으로 고정
    //리턴값은 생성한 객체의 주소값을 리턴
    //객체 생성시 필요한 데이터를 셋팅.
    Dancer() { //class 이름과 같이.
        dancerName = "갑돌이";
        crewName= "돌아이돌";
        genre = "아이돌 댄스";
        level = DanceLevel.AMATUER ;
    }
    //생성자 오버로딩
    Dancer(String dgenre) {
        dancerName = "관종킹";
        crewName = "서커스";
        genre = dgenre;
        level = DanceLevel.BEGINNER;
    }
    Dancer(String dName,String dGenre, DanceLevel dLevel) { //변수들은 생성 후 메모리가 삭제 됨.
        dancerName = dName;
        crewName= "하하";
        genre = dGenre;
        level = dLevel;

    }


    //기능(메서드) : static 붙이지 말고
    //춤추는 기능

    void dance() {
        System.out.println(genre+"춤을 열정적으로 춥니다");

    }

    //스트레칭을 하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풀어줍니다");
    }

    //자기소개 기능
    String introcduce(){
        return String.format("내 이름은 %s 이고 %s팀에 소속되어 있습니다. ", dancerName, crewName);

    }




}
