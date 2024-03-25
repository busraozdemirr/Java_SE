package week02;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {12, 23, 44, 56, 78};//alt + 8, alt + 9
        for (int i : arr) {
            int sum = i + 10;
            if (i < 50) {
                System.out.println("50 den küçük");
            } else {
                System.out.println("+10 eklenmiş hali : " + sum);
            }
        }
    }
}