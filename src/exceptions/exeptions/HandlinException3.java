package exceptions.exeptions;

public class HandlinException3 {
    public static void main(String[] args) {
        String name = null;

        if (name==null){
        System.out.println("Lütfen bir isim giriniz.!");
    } else {
            System.out.println(name.toUpperCase());
        }

    }
}
