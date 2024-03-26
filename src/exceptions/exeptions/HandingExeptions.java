package exceptions.exeptions;

public class HandingExeptions {
    public static void main(String[] args) {
        int number1 = 5;
        int [] array = new int[3];
        try {
            System.out.println((number1 / 0));
            System.out.println(array[3]);
            System.out.println("try blok içi");

        } catch (ArithmeticException e) {
            System.out.println("Caught AritmeticException");
        } catch (Exception e) {
            System.out.println("Caught Exception");

        } finally {
            System.out.println("merhaba");
            System.out.println("dünya");

        }
        System.out.println("kodun bitişi");


    }
}
