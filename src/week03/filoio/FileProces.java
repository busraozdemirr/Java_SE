package week03.filoio;

import java.io.File;
import java.io.IOException;

public class FileProces {
    public static void main(String[] args) throws IOException {
        File director = new File("MyDir");
        boolean bool = director.mkdir();
        System.out.println(bool); //false-> klasör zaten var

        File file = new File(director,"file");
        bool = file.createNewFile();
        System.out.println(bool);//false-> dosya zaten var
        bool= file.delete();
        System.out.println(bool);//true-> dosya silindi
        bool= director.delete();
        System.out.println(bool);//true-> içerisinde bir dosya olmadığı için artık klasörü de silebiliriz.
    }
}
