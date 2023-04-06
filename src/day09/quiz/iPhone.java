package day09.quiz;

public class iPhone extends SmartPhone {

    public iPhone(String model) {
        setModel(model);
        // super(model); 로 쓸 수 있음
    }

    @Override
    public String information() {
        return String.format("아이폰은 "+getModel()+"에서 만들어 졌고 제원은 다음과 같다\n"+
                super.makeCall()+"\n"+super.takeCall()+"\n"+
                charge()+"\n"+touchDisplay());
    }
//선생님 답
//    public String information() {
//        String message = String.format("아이폰 %s에서 만들어졌고 제원은 다음과 같다.\n", getModel());
//        message += makeCall() + "\n";
//        message += takeCall() + "\n";
//        message += takePicture() + "\n";
//        message += charge() + "\n";
//        message += touchDisplay() + "\n";
//
//        return message;
//    }


    @Override
    public String charge() {
        return String.format("고속충전, 고속 무선 충전");
    }

    @Override
    public String takePicture() {
        return String.format("1200만, 1600만 트리플 카메라");
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
    public String touchDisplay() {
        return String.format("정전식");
    }
}
