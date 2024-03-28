package week03.oop.principles.encapsulation;

public class Person {
   private String name;
    private String lastname;
    private int age;
    public  int getAge;
    private  String Tckimlik;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }
    public String getTckimlik(){
        return Tckimlik;
    }
    public void setTckimlik(String Tckimlik){
        this.Tckimlik=Tckimlik;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age<0){
            System.out.println("Yaş 0' dan az olamaz.");
        }else  if ( (age<=18)) {
            System.out.println("Ehliyet almak için yaşınız tutmuyor.");
            this.age = age;
        }else {
   }
        System.out.println("Tebrikler!Ehliyetinizi aldınız.:");
        this.age=age;
    }

    //contructer
    //userDefinedMethods
    //getter.setter methods
    //toString methods


    }


