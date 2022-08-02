import java.io.*;

public class DataOutputExample {
    public static void main(String[] args) throws IOException {
        // to write into file
        FileOutputStream file = new FileOutputStream(
                "D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/inputData.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Succcess...");

        //to read from file
        InputStream input = new FileInputStream("D:/ARPIT/Apna College/A C/Java + DSA Course/JAVA Programs/JAVA/STREAM/outputC.txt");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k+ "-");
        }
    }
}