package week02;

public class whileloop {
    public static void main(String[] args) {
        int start = 0, finish = 5;
        boolean status = true;
        while (finish>=0){
            System.out.println(("Start değeri : "+ start + "\tFinish değeri :" + finish));
            finish--;
            if(finish==0){
                break;
            }
        }
    }
}
