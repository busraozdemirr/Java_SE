package week03.methods.staticmethods;

public class StaticVsNonStatic {
    public static void main(String[] args) {
        int sayi1 = 15;
        int sayi2 = 20;
        StaticVsNonStatic StaticVsNonStatic = new StaticVsNonStatic();
        System.out.println(addnumbers2(sayi1, sayi2));
        System.out.println(StaticVsNonStatic.addnumbers1(sayi1, sayi2));
        System.out.println(StaticVsNonStatic.addnumbers2(sayi1, sayi2));

    }

    public int addnumbers1(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int addnumbers2(int a, int b) {
        return a + b;
    }






}
