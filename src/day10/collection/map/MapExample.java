package day10.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        // object로 되어서 value의 종류를 여러가지를 선택할 수 있음

        //put(K, V) :데이터 추가
        map.put("잔액", 5000);
        map.put("커피", "아메리카노");


        System.out.println(map.size());

        System.out.println(map); //{커피=아메리카노, 잔액=5000}

        //get(key) : 데이터참조
        Object balance = map.get("잔액");
        //value 가 object로 되어 있기때문에 downcasting을 염두에 둘 것

        System.out.println("balance = " + balance);

        map.put("커피", "카푸치노");// "커피" key로 value 수정
        System.out.println("map = " + map);//map = {커피=카푸치노, 잔액=5000}

        //반복문처리 : map 자체는 iter 사용 할 수 없음. map의 key를 반복문 처리해서 value값을 가져올 수 있음
        for(String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }


    }
}
