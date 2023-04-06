package day09.final_;

public class Main {


    public static void main(String[] args) {
        Person kim = new Person("김철수", "000111-2222222",  new BagPack(5, "만다리나덕"));

        kim.name = "김나나";
//        kim.ssn = ""  // ssn을 이미 final로 고정해뒀기 때문에 차후에 변경은 불가

    }
}
