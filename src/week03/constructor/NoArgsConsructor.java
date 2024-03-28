package week03.constructor;
//Bus sınıftın içerisindeisim,soyisim ve ülke fieldları olsun.Ülke fieldını çeriden atayan
// bir parametresiz bir constructer oluşturalım.Ülke değeribir nesne
// oluşturulması durumunda direkt olarak"Türkiye" değerini alsın.Sonrasında bu sınıftan üç adet nesne
// üretip isim soyisim bilgilerini doldurup ülkelerinin konsol çıktısını alalım.

public class NoArgsConsructor {

    String name;
    String lastname;
    String country="Türkiye";
    NoArgsConsructor(){
    }
    public static void main(String[] args) {
        NoArgsConsructor obj1 =new NoArgsConsructor();
        obj1.name ="BÜŞRA";
        obj1.lastname ="ÖZDEMİR";
        NoArgsConsructor obj2 =new NoArgsConsructor();

        obj2.name ="ELİF";
        obj2.lastname="ER";
        NoArgsConsructor obj3= new NoArgsConsructor();

        obj3.name="ALPEREN";
        obj3.lastname="İKİNCİ";

        System.out.println("Kişinin adı :"+obj1.name);
        System.out.println("Kişinin soyadı:"+ obj1.lastname);
        System.out.println("Kişinin ülkesi:"+obj1.country);
        System.out.println("Kişinin adı :"+obj2.name);
        System.out.println("Kişinin soyadı:"+ obj2.lastname);
        System.out.println("Kişinin ülkesi:"+obj2.country);
        System.out.println("Kişinin adı :"+obj3.name);
        System.out.println("Kişinin soyadı:"+ obj3.lastname);
        System.out.println("Kişinin ülkesi:"+obj3.country);

    }
}
