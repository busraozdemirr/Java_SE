package Week4.Collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample04 {
    public static void main(String[] args) {
        HashMap<Integer, String> languageHashMap = new HashMap<>();
        languageHashMap.put(1, "Java");
        languageHashMap.put(2, "Python");
        languageHashMap.put(3, "C");
        System.out.println("HashMap:" + languageHashMap);


        //anahtar üzerinden iterasyon
        System.out.println("İterasyon through keys");
        for (Integer key : languageHashMap.keySet()) {
            System.out.print("key");
            System.out.print(",");

        }

        //değerler üzerinden iterasyon
        System.out.println("İterasyon through value");
        for (Integer key : languageHashMap.keySet()) {
            System.out.print("value");
            System.out.print(",");
        }

        //anahtar/değer çifti üzerinden iterasyon
        System.out.println("İterasyon through key/value pairs");
        for (Map.Entry<Integer,String> entry:languageHashMap.entrySet()) {
            System.out.println(entry);
        }
        }
    }