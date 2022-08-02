import java.io.*;
import java.io.IOException;

public class CopyFileByteStream {
    public static void main(String[] args) throws IOException {
        // ByteStream chhe etle FileInputStream and FileOutputStream Lidheel chhe.
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("inputB.txt");
            out = new FileOutputStream("outputB.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}