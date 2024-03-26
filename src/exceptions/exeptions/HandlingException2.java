package exceptions.exeptions;

public class HandlingException2 {
    public static void main(String[] args) {

        int number1 = 5;
        String name = null;

        try {
            System.out.println("try blok içi");

        } catch (NullPointerException e) {
            e.printStackTrace();//try-catch e almasak görünecek hatayı konsola yazdırır.
            System.out.println(e.getMessage());
            System.out.println("Cought NPE");
        } finally {

            System.out.println("Finally Block");
        }
    }
}