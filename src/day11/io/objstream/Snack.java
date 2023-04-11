package day11.io.objstream;

import java.io.Serializable;

public class Snack implements Serializable {
//객체를 직렬화 해야 바이트스트림을 통과할 수 있다.
    //string은 기본적으로 직렬화가 되어 있지만, snack은 그게 아니라서!
    public enum Taste{
        GOOD, BAD, SOSO
    }

    private String snackName; //과자이름
    private String year; //출시연도
    private int price; //가격
    private Taste taste;



    public Snack(String snackName, String year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }
}
