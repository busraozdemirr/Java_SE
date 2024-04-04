package Week4.Collections.map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample03 {
    public static void main(String[] args) {


        TreeMap<Integer, String> numberMap = new TreeMap<>();
        numberMap.put(3, "three");
        numberMap.put(7, "seven");
        numberMap.put(1, "one");
        numberMap.put(5, "five");
        numberMap.put(9, "nine");
        numberMap.put(8, "eight");
        System.out.println("Before HeadMap:"+numberMap);

        System.out.println("HeadMap()");
        Map<Integer,String>headMap=numberMap.headMap(7);
        System.out.println("After HeadMap(7):"+headMap);

        Map<Integer,String>headMapWithBoolean=numberMap.headMap(7,true);
        System.out.println("After HeadMap(7,true):"+headMapWithBoolean);

        System.out.println("\nBeforeTailMap:"+numberMap);
        Map<Integer,String>tailMap=numberMap.tailMap(7);
        System.out.println("After tailMap(7):"+tailMap);


        Map<Integer,String>tailMapWithBoolean=numberMap.tailMap(7,false);
        System.out.println("After tailMapBoolean(7,false):"+tailMapWithBoolean);

        System.out.println("\nBeforeSubMap:"+numberMap);
        Map<Integer,String>SubMap=numberMap.subMap(3,7);
        System.out.println("After SubMap(3,7):"+SubMap);

        Map<Integer,String>SubMapWithBoolean=numberMap.subMap(3,false,7,true);
        System.out.println("After SubMapBoolean(3,false,7,true):"+SubMapWithBoolean);



    }
}
