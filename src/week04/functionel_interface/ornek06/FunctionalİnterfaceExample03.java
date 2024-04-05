package week04.functionel_interface.ornek06;

public class FunctionalİnterfaceExample03 {
    public static void main(String[] args) {
        String inputText="Merhaba Dünya 2077";
       /* StringTransformer toUppercaseTransformer =(input) ->{

            return input.toUpperCase();

        };*/
        StringTransformer toUpperCaseTransformer = String::toUpperCase;
        String tranformedText= toUpperCaseTransformer.transformer(inputText);
        System.out.println(tranformedText);
    }
}
