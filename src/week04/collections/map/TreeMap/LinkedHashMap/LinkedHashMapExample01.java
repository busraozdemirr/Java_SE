package week04.Collections.map.TreeMap.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample01 {

    public static void main(String[] args) {
        LinkedHashMap<String,String>nameMap=new LinkedHashMap<>();
        nameMap.put("book","kitap");
        nameMap.put("Aplication", "Uygulama");
        nameMap.put("apple","elma");
        nameMap.put(null, null);
        nameMap.put(null, "a");
        nameMap.put("null",null);
        nameMap.put(null,"b");
        System.out.println("LinkedHashMap:"+nameMap);


    }
}
