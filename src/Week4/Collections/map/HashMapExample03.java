package Week4.Collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {

        Map<String, List<String>> hashMap = new HashMap<>();
        hashMap.put("Ankara", List.of("Polatlı", "Yenimahalle", "Çankaya", "Kazan"));
        hashMap.put("İstanbul", List.of("Kadıköy", "Beyoğlu", "üSKÜDAR"));
        Map<String, Map<String, List<String>>> nesteHashMap = new HashMap<>();
        nesteHashMap.put("Türkiye", hashMap);
        for (Map.Entry<String, Map<String, List<String>>> entry : nesteHashMap.entrySet()) {
            System.out.println(entry);
            for (Map.Entry<String, List<String>> entry1 : entry.getValue().entrySet()) {
                System.out.println("\t" + entry1.getKey());
                for (String county : entry1.getValue()) {
                    System.out.println("\t\t" + county);
                }


            }
        }

    }
    }