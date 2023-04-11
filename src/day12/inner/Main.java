package day12.inner;



public class Main {

    //내부 클래스(inner class). Main class에는 static을 붙일 수 없지만, 내부에는 붙일 수 있음
    //public이 아니라 private을 사용할 수 있음
    public static class SubCalculator implements Calculator{
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {

        //덧셈 계산을 하는 계산기를 만들어서 쓰고 싶다
        AddCalculator addCal = new AddCalculator();
        System.out.println(addCal.operate(20, 40));

        //뺄셈 계산을 하는 계산기가 필요해지면 (현재 페이지의 메인에서만 사용하려면!)-> 내부클래스 만들기
        SubCalculator subCal = new SubCalculator();
        System.out.println(subCal.operate(50, 20));

        //곱셈하는 계산기가 필요. ->익명클래스로 만들어보기
        Calculator MultiCal = new Calculator()
//        class MultiCalculator implements Calculator : 바로 이름이 없는 클래스를 만듦.
        {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        System.out.println(MultiCal.operate(3,7));



        //나눗셈을 하는 계산기 (람다식으로 만들기). 인터페이스의 추상메서드가 딱 1개 일 때만 사용 가능.
        //alt + enter 로 기존식과 람다식으로 변형 가능.
        Calculator divCal =  (n1, n2) ->  n1 / n2;


        // 한 번만 사용할 것.
        Pet dog = new Pet() {

            @Override
            public void eat() {
                System.out.println("강아지는 사과를 먹어요");
            }

            @Override
            public void play() {
                System.out.println("강아지는 뛰어 놀아요");
            }
        };


    }
}
