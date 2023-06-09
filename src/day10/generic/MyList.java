package day10.generic;

import java.util.Arrays;

//배열을 제어하는 설계도
public class MyList<A> {
    //필드
    Object[] sArr;

    //생성자
    public MyList() {
        sArr = new String[0];
    }
    //메서드
    //배열에 저장된 데이터 수를 알려주는 기능

    public MyList(A ...initData) {
        sArr = new Object[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }


    public int size() {
        return sArr.length;
    }
    //배열에 맨 끝에 데이터를 추가
    public void push(A newData) {
        Object[] temp = new Object[sArr.length+1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length-1] = newData;
        sArr= temp; // temp는 지역변수라서 메서드가 끝나면 종료. 따라서 따로 null을 해줄 필요x
    }
    //배열 맨 끝 데이터 삭제 기능
    public A pop() {
        Object deleteTarget = sArr[sArr.length-1];
        Object[] temp = new Object[sArr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
        return (A)deleteTarget;
    }
    //배열 내부 데이터 출력
    public String toString() {
        return Arrays.toString(sArr);
    }
//배열이 비었는지 확인하기
    boolean isEmpty() {
//        if(sArr.length == 0) {
//            return true;
//        }else {
//            return false;
//        }

        return sArr.length == 0;

    }

    // 배열 데이터 전체삭제
    public void clear() {
        sArr = new Object[0];
    }

    //만들기
    //인덱스 탐색
    public int indexOf(A target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(A target) {
        return indexOf(target) != -1;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    public A remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        Object targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return (A)targetData;
    }
    // 중간 삭제 (remove) : 값으로 삭제
    public A remove(A target) {
        return remove(indexOf(target));
    }

    // 중간 삽입 (insert)
    public void insert(int index, A newData) {

        if (index < 0 || index > sArr.length - 1) return;
        if (index == sArr.length - 1) push(newData);

        Object[] temp = new Object[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }


    //자료 유무 확인

    //중간삭제

    //중간 삽입

public Object[] getsArr() {
        return sArr;
}

}
