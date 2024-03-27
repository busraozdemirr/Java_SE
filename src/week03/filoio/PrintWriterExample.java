package week03.filoio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("printwriter.txt");
        pw.println("Hello");
        pw.println("world");
        pw.println();
        pw.println("java");
        pw.flush();
        pw.close();
    }
}
