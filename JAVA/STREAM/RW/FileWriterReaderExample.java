import java.io.*;
import java.util.Scanner;

public class FileWriterReaderExample {

    // to read from file
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        // to write into file
        try {
            FileWriter fw = new FileWriter(
                    "D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/RW/towriteFile.txt");
            fw.write("bcdef");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");

        // to read fro file
        try {
            FileReader fr = new FileReader(
                    "D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/RW/towriteFile.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}