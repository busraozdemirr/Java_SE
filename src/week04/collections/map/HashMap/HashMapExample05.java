package week04.Collections.map.HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExample05 {
    public static void main(String[] args) {
        TreeMap<String,Integer> evenNumbers =new TreeMap<>();
        evenNumbers.put("two",2);
        evenNumbers.put("four",4);
        evenNumbers.put("Six",6);
        evenNumbers.put("Eight",8);
        System.out.println("TreeMap :"+evenNumbers);

        //TreeMap üzerinden HashMap oluşturmak
        HashMap<String,Integer>numberHashMap =new HashMap<>(evenNumbers);
        System.out.println("HashMAap:"+numberHashMap);



    }
}
