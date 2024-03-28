package week03.constructor;
// Ad,soyad yaş ve cinsiyet fieldlarını belirleyin.Sonrasında bu sınıfın 2 adet nesnesini oluşturalım.
// Bu nesnelerin yaş ve cinsiyet değerleri constructer parametrelerinden oluşturma alanına yerleştirin.
// Diğer iki değeri elle girelim.
public class ParameterizedConstructer {
    String name;
    String lastname;
    int age;
    String gender;
     ParameterizedConstructer(int age, String gender){
         //isim çekişmesi olacağı için"this" anahtar kelimesini
         // kullanarak sınıfının fieldı olan ageye erişeceğini belirtiyorum.
         this.age = age;
        this. gender =gender;
    }
    public static void main(String[] args) {
        ParameterizedConstructer obj1= new ParameterizedConstructer(31,"girl");
        obj1.name  ="Büşra";
        obj1.lastname="ÖZDEMİR";
        ParameterizedConstructer obj2=new ParameterizedConstructer(24,"girl");
        obj2.name  ="ELİF";
        obj2.lastname="ER";
        System.out.println("Kişinin adı:"+obj1.name);
        System.out.println("Kişinin soyadı:"+obj1.lastname);
        System.out.println("Kişinin yaşı:"+obj1.age);
        System.out.println("Kişinin cinsiyeti:"+obj1.gender);
        System.out.println("Kişinin adı:"+obj2.name);
        System.out.println("Kişinin soyadı:"+obj2.lastname);
        System.out.println("Kişinin yaşı:"+obj2.age);
        System.out.println("Kişinin cinsiyeti:"+obj2.gender);

    }
}
