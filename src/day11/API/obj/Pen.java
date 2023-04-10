package day11.API.obj;

import java.util.List;
import java.util.Objects;

public class Pen {

    Company company; //제조회사

    long serial;
    String color;
    int price;

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

//객체의 필드데이터를 빠르게 확인해 볼 때 toString 사용할 수 있음.
//    @Override
//    public String toString() {
//        return "이것은 펜이다";
//    }

//마법사로 생성한 toString은 필드값을 보여줌. toString의 재정의는 거의 필수.
    @Override
    public String toString() {
        return "Pen{" +
                "company" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


    //시리얼 번호가 같으면 같은 객체로 보고 싶다면.
    //equals를 오버라이딩하면 반드시 hashcode도 같이 오버라이딩 할 것.
    @Override
    public boolean equals(Object obj) {  //this의 타입이 Pen/
        if(obj instanceof Pen){
            Pen target = (Pen) obj;
            return this.serial == target.serial;

        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial);
    }
}
