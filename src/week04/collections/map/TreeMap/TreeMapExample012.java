package week04.Collections.map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample012 {
    public static void main(String[] args) {
        TreeMap<Integer, String> numberMap = new TreeMap<>();
        numberMap.put(3, "three");
        numberMap.put(7, "seven");
        numberMap.put(1, "one");
        numberMap.put(5, "five");
        numberMap.put(9, "nine");
        numberMap.put(8, "eight");
        System.out.println("Begining:" + numberMap);

        System.out.println("Higher");
        System.out.println("highKey(5):" + numberMap.higherKey(5));
        System.out.println("higherEntry(5):" + numberMap.higherEntry(5));

        System.out.println("Lover");
        System.out.println("loverKey(5):" + numberMap.lowerKey(5));


        System.out.println("Ceiling Function");
        System.out.println("ceiling.Entry(4):"+numberMap.ceilingEntry(4));
        System.out.println("CeilingKey(4):"+numberMap.ceilingKey(4));
        System.out.println("ceiling.Entry(5):"+numberMap.ceilingEntry(5));


        System.out.println("Floor Function");
        System.out.println("Floor.Entry(5):"+numberMap.floorEntry(5));
        System.out.println("Floor.Entry(4):"+numberMap.floorEntry(4));

        System.out.println("\nBefore poll methods: "+numberMap);

        Map.Entry<Integer,String>removedFirstEntry = numberMap.pollFirstEntry();
        System.out.println("\nAfter pollFirstEntry()"+numberMap);
        System.out.println("Removed Entry :"+removedFirstEntry);


        Map.Entry<Integer,String>removedLastEntry = numberMap.pollFirstEntry();
        System.out.println("\nAfter pollLastEntry()"+numberMap);
        System.out.println("Removed Entry :"+removedLastEntry);


    }
}
