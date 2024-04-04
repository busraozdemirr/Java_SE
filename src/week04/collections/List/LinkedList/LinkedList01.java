package week04.Collections.List.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[]args){
        // FIFO FELSEFESİYLE ÇALIŞIR
        Queue<String>languageQueue =new LinkedList<>();

        //Elemanlar ekleyelim
        languageQueue.add("Python");
        languageQueue.add("java");
        languageQueue.add("C");
        System.out.println("LinkedList:" +languageQueue);
        //En baştaki elemana erişelim

        String str1= languageQueue.peek();
        System.out.println("Accessed element:" +str1);
        //En baştaki elemana erişelim aynı zamandada listeden çıkaralım

        String str2= languageQueue.peek();
        System.out.println("Removed element:" +str2);
        System.out.println("LinkedList after poll():"+languageQueue );
        //listenin sonuna eleman ekleyelim

        languageQueue.offer("Swift");
        System.out.println( "LinkedList after offer():"+languageQueue );








    }
}
