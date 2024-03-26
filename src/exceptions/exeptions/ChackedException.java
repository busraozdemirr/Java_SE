package exceptions.exeptions;

import java.io.FileWriter;
import java.io.IOException;

public class ChackedException {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");

        } catch (IOException e) {
            System.out.println("Veri tabanında bir sorun oluştu");

        }
    }
    public void throusExample()throws IOException {
        FileWriter fw = new FileWriter("file.txt");
    }
}

