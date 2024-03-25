package week03;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        int toplam =0;
        int sayi;

       while(true){
           Scanner scanner= new Scanner((System.in));
           System.out.print("lÜTFEN BİR SAYI GİRİNİZ: ");
           sayi=scanner.nextInt();
           if(sayi ==0){
               System.out.println(" 0 sayısının girdiği girilen sayıların toplamı hesaplanıyor");
               break;
               toplam += sayi;


        }
           System.out.println("Sayıların toplamı = *");

        }


    }
}
