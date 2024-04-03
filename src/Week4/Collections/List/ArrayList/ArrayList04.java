package Week4.Collections.List.ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverseOrder;

public class ArrayList04 {

        public static void main(String[] args) {

            ArrayList<Integer> numberList = new ArrayList();
            numberList.add(3);
            numberList.add(4);
            numberList.add(11);
            numberList.add(4);
            System.out.println("Before sort" + numberList);
            Collections.sort(numberList);
            System.out.println("After sort" + numberList);
            Collections.sort(numberList,Collections.reverseOrder());
            System.out.println("After reverse"+numberList+"\n");
            numberList.sort(Collections.reverseOrder());
            System.out.println("Size:"+numberList.size()+"\n");
            ArrayList numberList2 =numberList;
            System.out.println("Clone List"+numberList2+"\n");

            ArrayList<Integer>numberList3 =numberList;
            System.out.println("Assigned List"+numberList3+"\n");

            System.out.println("Contains 1?"+numberList.contains(1));
            System.out.println("Contains 4?"+numberList.contains(4));
            System.out.println("İs Empty"+numberList.isEmpty()+"\n");

            List<Integer>numberList4 =new java.util.ArrayList<>();
            System.out.println("is Empty"+numberList4.isEmpty()+"\n");


            System.out.println("index0f 4:"+numberList.indexOf(4)+"\n");
            System.out.println("index0f 2:"+numberList.indexOf(2)+"\n");

        }

}








