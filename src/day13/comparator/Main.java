package day13.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>( //불변성을 깨기 위해 new ArrayList 안에 list.of를 작성해줄 것

                List.of( ///List.of는 고정된 리스트. add로 추가 할 수 없음. 수정도 되지 않음.
                new Student("김갑돌", 20, 80),
                new Student("김을돌", 22, 82),
                new Student("김병돌", 21, 85),
                new Student("김정돌", 23, 90)

        ) );
        //나이 순으로 오름차 정렬(나이적음 -> 나이 많음)
        studentsList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o1.getAge()- o2.getAge(); //o2-o1은 내림차 정렬.
            }
        });


        //이름 가나다순으로 오름차순
        studentsList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        studentsList.forEach(s -> System.out.println(s));






    }
}
