import java.util.*;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to APNA BANK ATM");
        System.out.println("To Withdraw choose 1");
        System.out.println("To Deposite choose 2");
        System.out.println("To check Balance choose 3");
        System.out.println("To exit choose 4");

        int Balance = 100000;
        int withdraw, Deposite;
        while(true){

            System.out.print("Enter number : ");
            int number = sc.nextInt();
            if(number < 1 || number >4){
                System.out.println("Please Enter valid number");
                System.out.print("Enter number : ");
                number = sc.nextInt();
            }
            switch(number){
                case 1:
                System.out.println("Enter money to Withdraw : ");
                withdraw = sc.nextInt();
                if(withdraw <= Balance){
                    Balance = Balance - withdraw;
                    System.out.println("Collect your Money");
                }
                else{
                    System.out.println("insufficient balance");
                }
                break;

                case 2:
                System.out.println("Enter your Money");
                Deposite = sc.nextInt();
                Balance = Balance + Deposite;
                break;

                case 3:
                System.out.println("your balance is " + Balance);
                break;

                case 4:
                System.exit(0);
            }
        }
    }
}