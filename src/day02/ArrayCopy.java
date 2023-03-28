package day02;

public class ArrayCopy {

    public static void main(String[] args) {

        //배열 복사 알고리즘
//        String[] pets = new String[] {"멍멍이","야옹이","짹짹이"};

        //선언과 동시에 초기호한다면 new Type[] 생략가능. 이외의 상황에서는 불가.
        String[] pets =  {"멍멍이","야옹이","짹짹이"};

       // String[] petsCopy = pets; // 배열의 주소를 복사. 배열이 복사된 건 아님.

//        System.out.println("원본주소 : "+pets);//원본주소 : [Ljava.lang.String;@1554909b
//        System.out.println("사본주소 : "+petsCopy);//사본주소 : [Ljava.lang.String;@1554909b

        //배열복사
        //1. 원본과 동일한 사이즈의 배열을 하나 더 생성
            String[] petsCopy = new String[pets.length];
        //2. 원본의 각 인덱스 값들을 사본에 인덱스로 복사
        //petsCopy[0] = pets[0];

        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        System.out.println("원본주소 : "+pets);//원본주소 : [Ljava.lang.String;@1554909b
        System.out.println("사본주소 : "+petsCopy);//사본주소 : [Ljava.lang.String;@6bf256fa
    }
}
