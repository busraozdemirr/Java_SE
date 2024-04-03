package Week4.Collections.List.LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
    public static void main(String[] args) {
        Deque<String>animalList =new LinkedList<>();
         //eleman ekleyelim
        animalList.add("cow");
        System.out.println("LinkedList:"+animalList);
        animalList.add("Dog");
        System.out.println("LinkedList after addFirst():"+animalList);

        //Son indeksten eleman ekleme
        animalList.addLast("cat");
        System.out.println("LinkedList after addLast():"+animalList);
        //ilk indeksten eleman silme
        animalList.removeFirst();
        System.out.println("LinkedListed after removeLast:"+animalList);
        animalList.removeLast();
        System.out.println("LinkedListed after removeLast:"+animalList);

    }
    }
