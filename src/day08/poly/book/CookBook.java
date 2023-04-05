package day08.poly.book;

public class CookBook extends Book{

    private boolean coupon; //요리학원 쿠폰 유무

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() { //boolean 타입의 getter만 이렇게 쓰임
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String info() {
        return String.format("분류 : 요리책, %s, 쿠폰유뮤 : %s",super.info(), this.coupon ? "있음" : "없음");
    }
}

