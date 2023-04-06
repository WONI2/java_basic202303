package day09.quiz;

public abstract class SmartPhone implements Camera,PhoneCall,Touchable {
    private String model;

    public abstract String information();
    public abstract String charge();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;

    }

    @Override
    public String makeCall() {
        return String.format("번호를 누르고 통화버튼을 누름");
    }

    @Override
    public String takeCall() {
        return String.format("전화받기 버튼을 누름");
    }

}
