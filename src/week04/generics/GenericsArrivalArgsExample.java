package week04.generics;

public class GenericsArrivalArgsExample {
    public static <T> void printArray(T... items) {
        for (T item : items) {
            System.out.print(item + " ");

        }
        System.out.println();

    }
    public static void main(String[] args) {
        System.out.println("String Dizisi");
        printArray("Merhaba","Dünya");

        System.out.println( "Integer Dizisi");
        printArray(1,2,3,4,"Merhaba");

        System.out.println("Double Dizisi");
        printArray(1.2,3.5,66.8);
    }

}
