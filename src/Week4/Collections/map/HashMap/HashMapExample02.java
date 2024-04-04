package Week4.Collections.map.HashMap;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {
        HashMap<Integer, String> languageHashMap = new HashMap<>();
        languageHashMap.put(1, "Java");
        languageHashMap.put(2, "Python");
        languageHashMap.put(3, "C");
        System.out.println("HashMap:" + languageHashMap);


        //belirli bir k ye denk gelen value yi döndürür
        String value = languageHashMap.get(2);
        System.out.println("value at key 2:" + value);

        //Anahtarı bir set olarak dönme -> keySet
        System.out.println("Keys:" + languageHashMap.keySet());

        //value ları bir set olarakdönme ->value
        System.out.println("Value:" + languageHashMap.values());

        //key/value çiftini bir set olarak dönme
        System.out.println("Key/Value mappings:" + languageHashMap.entrySet());

        //Anahtar varsa value sunu dön yoksa defouldda not found dön.
        // Bu key var dolayısıykla defould değerini döner
        String value1 = languageHashMap.getOrDefault(1, "Not Faund");
        System.out.println("Value for key 1:" + value1);


        //Anahtar varsa value sunu dön yoksa defouldda not found dön.
        // Bu key yok dolayısıykla defould değerini döner
        String value2 = languageHashMap.getOrDefault(1, "Not Faund");
        System.out.println("Value for key 1:" + value1);

        //bu key var mı diye kontrol etmek
        if (languageHashMap.containsKey(5)) {
            System.out.println("Map contains key value of:2");
        } else {
            System.out.println("key not found.");


        }
        //bir value var mı diye kontrol etmek
        if (languageHashMap.containsKey("java")) {
            System.out.println("Map contains key value of java");
        } else {
            System.out.println("no such value:");
        }
        //Bir key ile iliskili value değiştirmek(replace)
        System.out.println("Original Hashmap:"+languageHashMap);
        languageHashMap.replace(4,"Swift");
        System.out.println("HashMap after replace():"+languageHashMap);
        //bütün value değerlerini upperCase ye çevirin(replaceAll)
        languageHashMap.replaceAll((K,V)->V.toUpperCase());
        System.out.println("Updated HashMap:"+languageHashMap);

        //Bir   HashMap ten öğeleri kaldırmak/silmek(replace)
        String value3 =languageHashMap.remove(4);
        System.out.println("removed value:"+value3);
        System.out.println("update HashMAP:"+ languageHashMap);

        //bir hashMap ten bir key/value çiftini kaldırmak/silmek(remove(K.V))
        Boolean isDeleted =languageHashMap.remove(3,"C");
        System.out.println("isDeleted:"+isDeleted);
        System.out.println("Update:"+languageHashMap);


    }
}

