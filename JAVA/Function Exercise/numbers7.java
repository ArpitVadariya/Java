import java.util.*;

public class numbers7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        int cnt=0,positive=0,negative=0,zero=0,number;
        while(ch == 'y' || ch == 'Y'){
            ++cnt;
            System.out.print("Enter number = ");
            number = sc.nextInt();

            if(number==0){
                ++zero;
            }
            else if(number>0){
                ++negative;
            }
            else if(number<0){
                ++positive;
            }

            System.out.print("enter Y if you want to continue otherwise enter N ");
            ch = sc.next().charAt(0);
        }
        System.out.println("total numbers you enterd = " + cnt);
        System.out.println("negative numbers = " + negative);
        System.out.println("positive numbers = " + positive);
        System.out.println("zero numbers = " + zero);
    }
}