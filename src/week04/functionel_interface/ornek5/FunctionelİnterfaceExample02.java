package week04.functionel_interface.ornek5;

import java.util.Arrays;
import java.util.List;

public class FunctionelİnterfaceExample02 {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(1,2,3,4,5,6);
         int a=6;
         NumberListProcessor sumCalculator = numList ->{
             int sum =0;
             for (int num :numList){
                 sum+=num;

             }
             return sum;
        };
         int totalSum=sumCalculator.process(numbers);
        System.out.println("totalsum:"+totalSum);
    }

}
