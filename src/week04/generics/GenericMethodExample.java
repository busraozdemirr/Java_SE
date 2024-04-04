package week04.generics;

public class GenericMethodExample {
     public static <T> void  printArray(T[] array){
         for (T element:array){
             System.out.println(element+" ");

         }
         System.out.println();
     }

    public static void main(String[] args) {
         Integer[]integerArray = {1,2,3,4,5};
         Double[]doubleArray = {1.3,2.6,3.9,12.5};
         String[]stringArray ={"apple","banana","pinaple","cherry","watermmelon"};


        System.out.println("Integer Array");
        printArray((integerArray));
        System.out.println("Double Array");
       printArray(doubleArray);
        System.out.println("String Array");
        printArray(stringArray);



    }



}
