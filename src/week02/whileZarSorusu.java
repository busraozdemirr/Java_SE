package week02;

import java.util.Random;

public class whileZarSorusu {
    public static void main(String[] args) {
        int zar1, zar2, sayaç= 1,count=0;
        Random random = new Random();
        while (sayaç < 10000000) {
            zar1 = random.nextInt(1, 7);
            zar2 = random.nextInt(6) + 1;
            if (zar1 + zar2 == 12 || zar1 == 6 && zar2 == 6) {
                System.out.println("6-6 atıldı.");
                count++;
            } else {
                System.out.println("zar1 : " + zar1 + "\nzar2 : " + zar2);

            }
            sayaç++;
        }
double oran = (((double) count)/ sayaç);
        System.out.println(oran);
    }


    }

