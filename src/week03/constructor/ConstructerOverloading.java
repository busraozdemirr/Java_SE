package week03.constructor;

import java.util.concurrent.Callable;

public class ConstructerOverloading {

    String country;
    String language;
    ConstructerOverloading(String country,String language) {
        this.country = country;
        this.language = language;
    }
    ConstructerOverloading(String country){//Parametersized Constructer(Parametreli Constractor).
        this.country =country;

    }

    ConstructerOverloading(){}//NoArgsConstructer

        //no-args-constructer.Şuan herhangi bir constructer tanımlanmadığı için defould constructer
        //olarak bana no-args-constructer Java tarafından getiriliyor.
        /* 1.de NoArgsConstructer kullandık.İki field ın değerini de nesneyi oluşturduktan
            sonra ayrı ayrı atadık nesneyi oluştururken içini doldurmadık. */
        public static void main(String[] args) {
            ConstructerOverloading obj1 =new ConstructerOverloading();
            obj1.country ="Turkey";
            obj1.language="Turkısh";
            System.out.println(obj1.country+" "+obj1.language);

            ConstructerOverloading obj2 =new ConstructerOverloading("GERMANY");
            obj2.language ="Germany";

            ConstructerOverloading obj3= new ConstructerOverloading("England","Englısh");


        /*3.de bütün fieldları parameterized constructer ile aldık
        Dolayısıyla dışarıdan  ataması yapmama gerek kalmadı nesneyi oluştururken
         içini de doldurdum ALLargcostructer
         */
        }



        /*
    2. de parameterized constructer kullandık fieldlerden birinin diğerini nesneyi oluştururken
    argüman olarak verdik(country) değerini ise nesneyi oluşturduktan sonra dışarıdan atamasını yaptık.
*/





            }




