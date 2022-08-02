import java.util.*;

public class DivideStringInN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.next();
        int stringlength = str.length();
        System.out.print("Enetr a number N = ");
        int N = sc.nextInt();
        int temp=0;
        String[] equalStr = new String [N];  
        int characters = stringlength/N;

        if(stringlength % N != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ N +" equal parts.");  
        }
        else{
            for(int i = 0; i < stringlength; i = i+characters) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+characters);  
                equalStr[temp] = part;  
                temp++;  
            }  
            System.out.println(N + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
        }
    }
}