package hashing;

import java.util.HashMap;
import java.util.Map;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("Japan", 100);
        map.put("USA", 90);
        map.put("China", 240);
        System.out.println(map);
        for (Map.Entry<String,Integer> e : map.entrySet() ) {
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+" : "+value);
        }

        map.remove("USA");
        System.out.println(map);
    }
}
