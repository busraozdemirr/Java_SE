package week04.Collections.map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample01 {
    public static void main(String[] args) {
        TreeMap<Integer,String>numberMap =new TreeMap<>();
        numberMap.put(3,"three");
        numberMap.put(7,"seven");
        numberMap.put(1,"one");
        System.out.println("Begining:"+numberMap);


        TreeMap<Integer,String>numberMap2 =new TreeMap<>();
        numberMap2.put(5,"five");
        numberMap2.put(9,"nine");
        System.out.println("Begining:"+numberMap2);

        numberMap.putAll(numberMap2);
        System.out.println("After putAll():"+numberMap);


        System.out.println("get(5):"+numberMap.get(5));
        System.out.println("keySet(5):"+numberMap.keySet());
        System.out.println("values(5):"+numberMap.values());
        System.out.println("entrySet(5):"+numberMap.entrySet());
        System.out.println("size():"+numberMap.size());


        numberMap.remove(1);
        for ( Map.Entry<Integer,String>entry :numberMap.entrySet()){

            Integer key =entry.getKey();
            String value=entry.getValue();
            numberMap.putIfAbsent(3,"üc");
            System.out.println("entrySet() after putIfAbsent(3,'uc'):"+numberMap.entrySet());

            numberMap.putIfAbsent(1,"bir");
            System.out.println("entrySet() after putIfAbsent(1,'bir'):"+numberMap.entrySet());

            numberMap.remove(1);
            System.out.println("entrySet() after putIfAbsent(1,'one'):"+numberMap.entrySet());

            Integer firstKey =numberMap.firstKey();
            System.out.println("FirstKey:"+firstKey);
            Integer lastKey =numberMap.lastKey();
            System.out.println("LastKey:"+lastKey);

            System.out.println("First entry:"+numberMap.firstEntry());
            System.out.println("Lastentry:"+numberMap.lastEntry());







        }

        }






    }

