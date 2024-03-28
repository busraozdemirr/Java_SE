package week03.garbagecoolector;

public class TestGarbage1 {
    public void finalize(){
        System.out.println("object is garbage collection");
    }
    public static void main(String[] args) {
        TestGarbage1 garbage1= new TestGarbage1();
        /* Bunlar heap te ayrı yerde tutulur.*/


        TestGarbage1 garbage2= new TestGarbage1();
        TestGarbage1 garbage3 =new TestGarbage1();
                /*Bunlar heap te aynı yerde görünür.*/


        TestGarbage1 garbage4 = garbage3;

        garbage1 =null;
        garbage2 =null;
        garbage3 =null;
        garbage4 =null; //bunun çöpü yoktur çünkü değerini garbage 3 ten alıyor
        //yani garbage 3ve garbage4 heap te aynı değere referanslanmış.
        new TestGarbage1();
System.gc();



    }
}
