package day08.poly.book;
import day05.member.Gender;

import java.util.Scanner;

import static day07.Util.Utility.*;


public class LibraryView {
    private static Scanner sc;
    private static LibraryRepository repository;

    //static data는 생성자에서 초기화하면 안됨.
    //static 필드의 초기화는 static initializer를 사용
    static {//static initializer. 자동호출
        sc = new Scanner(System.in);
        repository = new LibraryRepository();

    }

    //회원정보 입력처리
    private static void makeNewBookUser() {
        System.out.println("회원정보를 입력해주세요");
        String name = input("이름 : ");
        int age = Integer.parseInt(input("나이: "));
        Gender gender = inputGender();

        //입력받은 데이터 객체로 포장.
        BookUser userInfo = new BookUser();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);


        //입력받은 유저 객체를 저장소로 보내기.
        repository.register(userInfo);

    }

    //정확하게 성별을 입력할 때까지 반복입력 받는 메서드.
    private static Gender inputGender() {
        while (true) {
            String inputGender = input("성별: ");
            Gender gender;
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    return Gender.MALE;
                case 'F':
                    return Gender.FEMALE;
                default:
                    System.out.println("성별을 잘못 입력하셨습니다!");
            }
        }
    }

    //화면처리

    public static void start() {
      makeNewBookUser();

        //메인메뉴 띄우기
        while (true) {
            showMainScreen();
            selectMenu();
        }
    }

    private static void selectMenu() {
        String selNum = input("번호 : ");
            switch (selNum) {
                case "1":
                    //가입한 회원정보 출력
                    BookUser user = repository.findBookUser();
                    System.out.println("***회원정보***");
                    System.out.println("* 회원명 : "+user.getName());
                    System.out.println("* 나이 : " + user.getAge());
                    System.out.println("* 성별 : " + user.getGenderToString());
                    System.out.println("* 쿠폰개수 : "+user.getCouponCount());
                    break;
                case "2":
                    String[] infoList = repository.getBookInfoList();
                    System.out.println("모든도서정보");
                    for (String info : infoList) {
                        System.out.println(info);
                    }
                    break;
                case "3":
                    //검색어 입력받기
                    String keyword = input("검색 : ");
                    // 저장소에게 해당 검색어를 주고 검색에 걸린 책 정보를 받아옴
                    String[] bookInfoList = repository.searchBookInfoList(keyword);
                        if(bookInfoList.length>0) {
                            System.out.println("***검색결과***");
                            for (String info : bookInfoList) {
                                System.out.println(info);
                                break;
                            }
                        }else {
                            System.out.println("검색결과가 없습니다.");
                        }
                    break;
                case "4":
                   showBookList();
                   int rentBookNum = Integer.parseInt(input("대여할 도서번호 입력 : "));
                   RentStatus rentStatus = repository.rentBook(rentBookNum);
                   if(rentStatus == RentStatus.RENT_SUCCESS_WITH_COUPON){
                       System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
                   } else if (rentStatus == RentStatus.RENT_SUCCESS) {
                       System.out.println("성공적으로 대여되었습니다. ");
                   }else{
                       System.out.println("도서대여에 실패하였습니다.");
                   }

                    break;
                case "5":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("메뉴번호를 입력해주세요");



            }



    }
        private static void showMainScreen() {
            //메인메뉴창을 출력하는 메서드
            System.out.println("======도서메뉴=====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서전체조회");
            System.out.println("3. 도서검색");
            System.out.println("4. 도서 대여");
            System.out.println("5. 프로그램종료하기");

        }

        private static void showBookList() {

        //대여 가능한 책의 목록을 번호와 함께 출력
            String[] BookList = repository.getBookInfoList();
            System.out.println("***대여가능 도서 목록***");
            int i = 1;
            for (String info : BookList) {
                System.out.println(i+"번째 도서 :"+info);
//                System.out.printf("%d. %s\n",i++,info);
                i++;
            }



        }

        static void rentBook() {
            showBookList();
            int rentBookNum = Integer.parseInt(input("대여할 도서번호 입력 : "));


//            String[] rentBookList = repository.getBookInfoList();
//            for (int i = 0; i < rentBookList.length; i++) {
//                if((rentBookNum - 1) == i ){
//
//                }
//            }



        }

    }

