package week04.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {
    public static void main(String[] args) {
        List<String> firstList =new ArrayList<>();
        firstList.add("java");
        firstList.add("python");
        List<String> secontList =new ArrayList<>();
        secontList.add("Scala");
        secontList.add("Kotlın");
        List<String> thirdList =new ArrayList<>();
        thirdList.add("ReactJS");


        secontList.addAll(firstList);
        thirdList.addAll(secontList);
        System.out.println(thirdList);


    }
}
