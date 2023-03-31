package day05.member;

import java.util.Scanner;

//역할: 회원관리 앱의 입출력 담당
public class MemberView {

    Scanner sc;
    MemberRepository mr; // MemberRepository로 정보를 가져오기 위해 필드를 가지고 있는 것. 생성자에서 초기화 해줄 것

    public MemberView() {
        //되도록 생성자를 통해 초기화.
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }

    /*초기 메인 화면을 출력하는 기능 */
    void mainView() {
        System.out.println("*회원관리시스템*");
        System.out.println("1. 회원정보 등록하기");
        System.out.println("2. 회원정보 조회하기");
        System.out.println("3. 회원정보 전체조회");
        System.out.println("4. 회원정보 수정하기");
        System.out.println("5. 회원정보 삭제하기");
        System.out.println("6. 프로그램 종료하기");
        System.out.println("==================");
    }
    /*프로그램 화면 흐름을 제어하는 기능*/
    void viewProcess() {
        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum){
                case "1" :
                    signUp();
                    stop();
                    break;
                case "2" :
                    searchMember();
                    stop();
                    break;
                case "3" :
                    mr.showMembers();

                    break;
                case "4" :
                    break;
                case "5" :
                    break;
                case "6" :
                    String answer = input("정말로 종료하시겠습니까? [y/n]");
                    if(answer.toLowerCase().charAt(0)=='y') {
                        System.out.println("프로그램을 종료합니다");
                        System.exit(0);
                    }else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("번호를 입력해주세요");

            }


        }


    }

 String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
//엔터를 누르기 전까지 멈추기 기능
    void  stop() {
        System.out.println("엔터를 눌러 계속하기");
        sc.nextLine();
    }

    //회원정보 등록 처리
    void signUp() {
        System.out.println("회원정보를 등록해주세요");

        String email;
        while (true) {
            email = input("이메일: ");
            if(!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("중복된 이메일 입니다");
        }
        String name = input("이름: ");
        String password = input("패스워드: ");

        Gender gender;
        checkGender: while (true) {
            String inputGender = input("성별[M/F]: ");
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M' :
                    gender = Gender.MALE;
                    break checkGender;
                case 'F' :
                    gender = Gender.FEMALE;
                    break checkGender;
                default:
                    System.out.println("성별을 정확히 입력해주세요");
            }
        }
        int age = Integer.parseInt(input("나이: "));

        //실제 저장 명령
        Member member = new Member(name, email, password, mr.getLastMemberId() + 1, gender, age);
        mr.addMember(member);
        System.out.println("회원가입 성공!");

    }

    void searchMember() {
        // 이메일 입력하세요!
        String inputEmail = input("# 조회를 시작합니다!\n# 이메일: ");
        Member foundMember = mr.findByEmail(inputEmail);
        // 찾은 회원의 정보 ~~~~~~
        if (foundMember != null) {
            System.out.println("\n========= 조회 결과 =========");
            System.out.printf("# 이름: %s\n", foundMember.memberName);
            System.out.printf("# 비밀번호: %s\n", foundMember.password);
            System.out.printf("# 성별: %s\n", (foundMember.gender == Gender.MALE) ? "남성" : "여성");
            System.out.printf("# 나이: %d세\n", foundMember.age);
        } else {
            System.out.println("\n# 조회된 회원이 없습니다.");
        }
        stop();

    }

    }




