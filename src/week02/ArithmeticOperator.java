package week02;

import java.io.PrintStream;

public class ArithmeticOperator {

    public static void main(String[] args) {
        int number1 = 25, number2 = 3, number3 = 17;
        String  websiteName = "Web Sitemiz: ", websiteleri = "www.bilgeadam.com";
        // Stringlerde ekleme operatörü kullanırsak:
        System.out.println("Merhaba!\n"+websiteName + websiteleri + "Sitemizi ziyaret edin"); // \ "-> alt + *)
        //Ekleme - Çıkarma operatörleri:
        System.out.println("A + B ="+ (number1+number2));
        System.out.println("A - C =" +(number1-number2));
          //Çarpma ve Bölme Operatörleri
        System.out.println("A + B = " +(number1*number2));
        System.out.println("A / 5 = " +(number1/5));

        //Mod Alma Operatörü:
        System.out.println("C % B = " + (number3%number2));
    }

}
