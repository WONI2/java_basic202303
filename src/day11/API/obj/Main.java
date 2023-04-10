package day11.API.obj;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen(1123, "파랑", 1000);
        p1.company = new Company("모나미", "서울");

        Pen p2 = new Pen(1123, "파랑", 1000);

        System.out.println(p1);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2)); //equals만으로는 Set에서 까지 주소값이
        //같다고 인정해주지는 않기 때문.

        Set<Pen> penSet = new HashSet<>();
        penSet.add(p1);
        penSet.add(p2);

        System.out.println(penSet.size());

        System.out.println(p1.hashCode()); //기존에 p1, p2의 hashcode가 다름.
        System.out.println(p2.hashCode());
        //Pen에서 hashcode를 같게 해줬기 때문에 주소값이 같게 나오고, Set에도 1개가 담겨 있는 것으로 봄






    }

}
