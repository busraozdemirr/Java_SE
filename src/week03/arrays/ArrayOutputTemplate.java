package week03.arrays;

public class ArrayOutputTemplate {
    public static void main(String[] args) {
        int[] numberArr = {15, 13, 20, 50, 31, 56, 75};
        int sayaç = 0;
        System.out.print("[");
        for(int number : numberArr){
            if(sayaç<numberArr.length-1) {
                System.out.print(number + ",");
            }else{
                System.out.print(number);
            }
            sayaç++;
        }
        System.out.println("]");

        System.out.println("başka bir array");
    }
}
