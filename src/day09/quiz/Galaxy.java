package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil{

    public Galaxy(String model) {
        setModel(model);
    }


    @Override
    public String information() {
        return String.format("갤럭시는 "+getModel()+"에서 만들어 졌고 제원은 다음과 같다\n"+
                            super.makeCall()+"\n"+super.takeCall()+"\n"+
                charge()+"\n"+touchDisplay()+"\n블루투스 펜 탑재 여부 :"+bluetoothPen());
    }

    @Override
    public String charge() {
        return String.format("고속충전, 고속 무선 충전");
    }

    @Override
    public String takePicture() {
        return String.format("1300만 듀얼 카메라");
    }

    @Override
    public String makeCall() {
        return null;
    }

    @Override
    public String takeCall() {
        return null;
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String touchDisplay() {

        return String.format("정전식, 와콤펜 지원");
    }
}
