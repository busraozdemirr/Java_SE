package week03.arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] numberArr = {2, -9, 5, 0, 12, -25, 22, 9, 8, 12};
        int toplam=0;
        double oran=0;
        for (int number : numberArr) {
            toplam=(toplam+number);
            oran=((double) toplam/numberArr.length);
        }
        System.out.println(toplam);
        System.out.println(oran);
        
    }
}
