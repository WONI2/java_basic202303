package day11.API.String;

public class StrBuilder {

    private static void makeString() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 50000; i++) {
            s += "A";

        }
        long end = System.currentTimeMillis();
        System.out.println("총 소요시간 : " +(end - start) + "millisecond");
    }

    private static void makeStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 50000; i++) {
            s.append("A");

        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder 총 소요시간 : " +(end - start) + "millisecond");
    }

    public static void main(String[] args) {

        makeString();
        makeStringBuilder();

    }
}
