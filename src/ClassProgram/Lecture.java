package ClassProgram;

public class Lecture {
    //각 수업에 따른 단계를 모두 가지고 있으니까 단계를 나누고(메서드), 메서드는 써도 되고 안써도 되니까.
    // 각 단계의 제목과 내용은 다르니 필드는 제목과 내용으로 작성.  받아줘야 함.

    private String title;
    private String content;
    private String level;

    public Lecture(String title, String content, String level) {
        this.title = title;
        this.content = content;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void start () {

    }

    public void middle () {

    }
    public void advanced() {

    }

    public void top(){

    }

    public String information() {
        return String.format("수업: "+this.title+"\n"+
                            "내용 : "+this.content+"\n"+
                            "level : "+ this.level);
    }

}
