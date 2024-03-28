package week03.oop.principles.inheritance;

public class Dog extends Animal{
     public void display(){

         System.out.println("My name is"+name);
     }
     @Override
     public void eat(){ //Method overiding
        // Super.eat();//superclass daki eat() metodu.
         // this. eat();bu sınıfdaki eat() metodu.

         System.out.println("Dog can eat");
     }

}
