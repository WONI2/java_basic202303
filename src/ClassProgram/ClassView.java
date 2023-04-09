package ClassProgram;



import static day07.Util.Utility.*;

public class ClassView {

    static ClassRepository cr;

    public void start() {

        while (true) {
            System.out.println("***진행할 목록의 번호를 골라주세요***");
            System.out.println("1. 전체수업조회");
            System.out.println("2. 수업검색");
            System.out.println("3. 수업추가");
            System.out.println("4. 종료하기");
            String selNum =  input(">>");

            switch(selNum) {
                case "1" :
                 lectureListup();
                    break;
                case "2" :

                    break;
                case "3" :
                    break;
                case "4" :
                    System.exit(0);
                    break;
                default :
                    System.out.println("목록의 숫자만 입력해주세요");

            }
        }
    }
public static void lectureListup() {
    String[] lecture = cr.getLectureList();
    for (String lec : lecture) {
        System.out.println(lec);
    }
}
public void searchLec() {
    System.out.println("검색 방법을 선택해주세요 [1.카테고리별 / 2. 단계별]");
    String searchNum = input(">>");
//    switch(searchNum) {
//        case
//    }

    }


}
