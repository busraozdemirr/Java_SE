package week03.oop.principles.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.setAge(31);
        p1.setName("Büşra");
        p1.setLastname("özdemir");
        p1.setTckimlik("32881679914");
        System.out.println("İsim :"+p1.getName()
                + "\nsoyisim :" +p1.getLastname()
                +"\nYaş:"+p1.getAge()
        +"\nTckimlik:"+p1.getTckimlik());
        System.out.println();
    }
}
