import java.io.*;

public class FileOutputStreamExample {

    public static void main(String[] args) throws Exception {

        // to write into file using byte array or any character
        try {
            FileOutputStream fout = new FileOutputStream(
                    "D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/testout.txt");
            // FileOutputStream fout = new FileOutputStream(
            // "D:\\ARPIT\\Apna College\\A C\\Java + DSA Course\\JAVA
            // Programs\\JAVA\\STREAM\\testout.txt");
            // TO write byte in file
            // fout.write(65);
            String s = "Welcome to java.";
            byte b[] = s.getBytes();// converting string into byte array
            // TO write string in file
            fout.write(b);
            // fout.write(here array, starting index, length of string)
            // fout.write(b, 5, 10);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

        // to read from file
        try {
            FileInputStream fin = new FileInputStream(
                    "D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/testout.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}