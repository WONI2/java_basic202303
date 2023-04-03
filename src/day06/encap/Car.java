package day06.encap;

public class Car {
    //필드에 바로 접급하지 못하도록 private으로 막아줘야 함.

    private String model; //모델명
    private int speed; //현재속도 // 기본값 = 0 따라서 생성자에서 새로 설정x.
    private char mode; //변속 모드 (D, N, R, P)
    private boolean start; //시동 온오프상태. 기본값 false

    //생성자 : 객체가 처음 생성될 때
    public Car(String model) { //달라질 수 있는 것을 parameter로 받음
        this.model = model;
        this.mode = 'P';

    }


    //setter : 필드값을 제어하기 위한 메서드
    public void setSpeed(int speed) {
        if(speed < 0 || speed > 200 ) return;
        this.speed = speed;
    }
    //getter : 참조를 위한 메서드
    public int getSpeed() {
        //필드에는 km로 저장되어 있는데,
        //mile로 변환해줘야 함.변환 공식을 사용할 수 있다.
        return this.speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
       switch(mode) {
           case 'D': case 'R': case 'N': case 'P':
               this.mode =mode;
               break;
           default:
               this.mode = 'P';
       }


    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    //엔진에 연료가 주입되는 기능
    private void inject() {
        System.out.println("연료가 주입됩니다");
    }

    //엔진오일이 순환하는 기능
    private void putOil() {
        System.out.println("엔진오일이 순환합니다");
    }

    //엔진실린더가 움직이는 기능
    private void moveCylinder() {
        if(start) {
            System.out.println("실린더가 움직입니다");
        }else{
            System.out.println("차가 폭발합니다");
        }
    }

    //시동버튼을 누르는 기능
    public void pressButton() {
        this.start = true;
        inject();
        putOil();
        moveCylinder(); //캡슐화를 통해 내부적으로 순서를 정해둠.
        System.out.println("시동이 걸렸습니다");
    }



}
