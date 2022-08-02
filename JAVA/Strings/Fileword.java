import java.io.*;
import java.util.*;

public class Fileword {

    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("C:/Users/ARPIT PC/OneDrive/Desktop/Words.txt");

        Scanner sc = new Scanner(obj);

        System.out.println(sc.next());
    }
}