import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String args[]) throws Exception {
        // to write into file from string or
        FileOutputStream fout = new FileOutputStream(
                "D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/inputBuffer.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to DSTC";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");

        //to read from file and print to console or any other field
        try {
            FileInputStream fin = new FileInputStream("D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/inputBuffer.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}