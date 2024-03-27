package week03.oop;

public class Test {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        System.out.println(className.sayHELLO("Büşra"));
        System.out.println(className.sum(1,5));
        ClassName className2 = new ClassName();
        System.out.println(className2.sayHELLO("Elif"));
        System.out.println(className2.sum(8,12));

        Person p1 = new Person();
        p1.name ="BÜŞRA";
        p1.gender ="Elif";
        p1.sleep();

        Person p2 = new Person();
        p2.name="Elif";
        p2.nickname = "el";

        p2.sleep();
        p2.walk();


    }
}
