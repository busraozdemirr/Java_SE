package week03.filoio;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println(file.exists());
        try {
            if (!file.exists()){
                file.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(file.exists());
    }
}
