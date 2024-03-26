package week03.methods;

import java.util.Scanner;

public class MethodQuestion {
    // 2 adet sayının  arasındaki sayıların karesi.
    public static void main(String[] args) {
        MethodQuestion methodQuestion = new MethodQuestion(); //->MethodQuestion()->constructor math
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz : ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Lütfen 2. sayıyı giriniz: ");
        int num2 = Integer.parseInt(scanner.nextLine()); //Intager.parseInt(\n*)


        int min;
        int max;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {

            max = num2;
            min = num1;
        }
        for (int i = min; i <= max; i++) {
            System.out.println(methodQuestion.getSquare(i));
            // min = Math.min(num1,num2);
            // max = Math.max(num1,num2);
            // System.out. printLn();
            //System.out.prıntLn();

        }
    }
        public long getSquare(int number){
            //return (long) Math.pow(number,2);
            return number*number;
        }



}










