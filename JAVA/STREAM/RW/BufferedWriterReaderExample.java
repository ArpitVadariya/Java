import java.io.*;

public class BufferedWriterReaderExample {
    public static void main(String[] args) throws Exception {
        // to write into file
        FileWriter writer = new FileWriter(
                "D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/RW/toBufferwriteFile.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to BufferWriteFile.");
        buffer.close();
        System.out.println("Success");

        // to read from file
        FileReader fr = new FileReader(
                "D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/RW/toBufferwriteFile.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
