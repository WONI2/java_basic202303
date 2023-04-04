package day07.lotto;

import java.util.Arrays;

import static day07.lotto.Lotto.*;

public class SimulatorLotto extends Lotto {
    static int LottoNumber;
    static int[] lotto;

    public static void run() {

//        Lotto.information();
        lotto = new int[6];
        //6자리 숫자를 뽑고, 6자리가 모두 같을 때 끝남
        for (int i = 0; i < lotto.length; i++) {
            LottoNumber = (int) (Math.random() * 45) + 1;
            lotto[i] = LottoNumber;
        }
        System.out.println(Arrays.toString(lotto));

        count();
//        int pick = 0;
//        while (true) {
//
//            pick++;
//            System.out.println(pick+"번째 추첨입니다.");
//            if(count() == 6) {
//                System.out.println("1등에 당점되었습니다.");
//                break;
//            } else if (count() == 5) {
//                System.out.println("2등에 당첨되었습니다");
//                break;
////                return;
//            } else if (count() == 4) {
//                System.out.println("3등에 당첨되었습니다");
//                       break;
////                return;
//            } else if (count() == 1) {
//                System.out.println("4등에 당첨되었습니다");
//                break;
//            }else if(count() == 0) {
//                System.out.println("당첨된 번호가 없습니다");
//                break;
//            }
//
//        }

    }



    public static void count() {
        Lotto.information();
        int n = 0; //일치한 숫자의 개수
        System.out.println(Arrays.toString(Lotto.number));

        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < Lotto.number.length; j++) {
                if (lotto[i] == Lotto.number[j]) {
                    System.out.println("==="+Arrays.toString(Lotto.number));
                    n++;
                }
            }
        }

    }

}


// 선생님 답안
//package day07.lotto;
//
//        import day07.util.Utility;
//
//        import java.util.Arrays;
//
//public class LottoSimulator {
//
//    private static int[] makeMyLotto() {
//        // 나의 번호
//        System.out.println("구매번호를 6개 차례대로 입력하세요.");
//        int[] myLotto = new int[6];
//
//        int i = 0;
//        while (i < myLotto.length){
//            int number = Integer.parseInt(Utility.input(String.format("%d번째 번호 >> ", i+1)));
//
//            if (!Lotto.isDuplicate(myLotto, number)) {
//                myLotto[i] = number;
//                i++;
//            } else {
//                System.out.println("# 중복번호입니다.");
//            }
//        }
//
//        return myLotto;
//    }
//
//    public static int checkLotto(int[] winNumbers, int[] myLotto) {
//        int count = 0 ;  // 일치한 숫자의 수
//        for (int n : winNumbers) {
//            for (int m : myLotto) {
//                if (m == n) count++;
//            }
//        }
//        return count;
//    }
//
//    public static void run() {
//        // 1등 당첨번호
//        int[] winNumbers = makeMyLotto();
//
//        int paper = 0; // 구매한 장수
//        while (true) {
//            int[] purchasedLottoNumbers = Lotto.getLotto();
//            paper++;
//
//            int count = checkLotto(winNumbers, purchasedLottoNumbers);
//
//            if (count == 6) {
//                System.out.printf("# %d장만에 1등에 당첨되었습니다. ㅊㅋㅊㅋ\n", paper);
//                break;
//            } else {
//                System.out.printf("# %d장째 구매중... ㅠㅠ\n", paper);
//            }
//        }
//    }
//}