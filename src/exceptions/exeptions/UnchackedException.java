package exceptions.exeptions;

public class UnchackedException {
    //-> Runtime hataları yani çalışma zamanında gerçekleşen hatalar.
    public static void main(String[] args) {
        String name = null;
        //kötü kaka yaklaşım.
        try {
            if(name .equals("alperen")){
                System.out.println("name : alperen");
            }
        }catch (NullPointerException e){
            System.out.println("catch!");
        }  //eh işte idare eder.Fena değil.
     if(name!=null && name.equals("alperen")){
            System.out.println("name :alperen");
    }
     //wow mükemmel en süper birinci yöntem
         if("alperen".equals(name)){
        System.out.println("name : alperen");}//null değer sadece objelere verilebilir.
}
}