import java.util.*;

public class arrayname10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name length : ");
        int length = sc.nextInt();

        String name[] = new String[length];

        System.out.println("Enter name letter one by one");
        for(int i =0;i<length;i++){
            name[i] = sc.next();
        }

        System.out.print("name is : ");
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]);
        }
    }
}