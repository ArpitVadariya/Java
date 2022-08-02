// Write a JAVA program to create an interface Operation and add two methods withdraw(double amount)and deposit().implement operation interface in SBI Bank class and HDFC class.

import java.util.*;

interface Operation{
    
    void withdraw(double amount);

    void deposite();
}

class SBI implements Operation{
    SBI(){
        System.out.println("SBI bank");
        System.out.println();
        System.out.println("current balance is " + balance);
    }
    Scanner sc = new Scanner(System.in);
    public static double balance = 100000.0;
    public void withdraw(double amount){
        
        balance = balance - amount;
        System.out.println(amount + " withdrawed.");
        System.out.println("availabel balance is " + balance);
    }

    public void deposite(){
        System.out.print("Enter amount to deposite : ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println(amount + " deposited.");
        System.out.println("availabel balance is " + balance);
    }
}

class HDFC implements Operation{
    HDFC(){
        System.out.println("HDFC bank");
        System.out.println();
        System.out.println("current balance is " + balance);
    }
    Scanner sc = new Scanner(System.in);
    public static double balance = 500000.0;
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println(amount + " withdrawed.");
        System.out.println("availabel balance is " + balance);
    }

    public void deposite(){
        System.out.print("Enter amount to deposite : ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println(amount + " deposited.");
        System.out.println("availabel balance is " + balance);
    }
}


public class Q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SBI s = new SBI();
        System.out.print("Enterb amount to withdraw : ");
        double Samount = sc.nextDouble();
        s.withdraw(Samount);
        s.deposite();


        System.out.println();
        System.out.println();
        
        
        HDFC h = new HDFC();
        System.out.print("Enterb amount to withdraw : ");
        double Hamount = sc.nextDouble();
        h.withdraw(Hamount);
        h.deposite();
    }
}