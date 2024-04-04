package week04.generics;

public class GenericClassTExtendsA <T extends Number>{




    public void  display(){

        System.out.println("this ,is a bounded type generics class");

    }

    public static void main(String[] args) {
        //GenericClassTExtendsA<String>strObj1=new GenericClassTExtendsA<String>();
        //Typeparameter'java.lang.String'is not within its boundshould extend java lang number
        GenericClassTExtendsA<Integer>intObj =new GenericClassTExtendsA<>();

    }

}
