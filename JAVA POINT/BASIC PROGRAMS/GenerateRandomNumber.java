import java.util.*;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println("Random number = " + (int)rd.nextInt(10000));
    }
}