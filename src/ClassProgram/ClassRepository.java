package ClassProgram;

public class ClassRepository {

    private static Lecture[] lectureList;
        static  {
            lectureList = new Lecture[] {
                    new Water("색상쌓기","수채화의 색상을 쌓아보아요","start"),
                    new Oil("오일로 색칠해보기", "오일을 이용한 색칠하기를 경험해보아요 ","start"),
                    new Dessin("선긋기", "소묘의 기본인 선을 그어보아요", "start"),
                    new Sculp("조각도의 이해", "조각도를 이용하는 방법을 배워보아요", "start"),
                    new Water("수채풍경화", "원하는 풍경화를 따라 그려보아요", "advanced"),
                    new Dessin("손그리기", "자신의 손을 그려보아요","middle")

            };
        }
        public String[] getLectureList() {
            String[] Lecture = new String[lectureList.length];
            for (int i = 0; i < Lecture.length; i++) {
                Lecture[i] = lectureList[i].information();
            }
            return Lecture;
        }

        //수업검색 - category로
        public void searchLectureByCat() {

        }
        //수업검색 - level로




}
