import java.util.*; //package import

class Variable2{
    public static void main(String args[]){
        int age;    //age variable declare
        Scanner sc = new Scanner(System.in);    //Input
        System.out.print("Enter your age --> ");
        age = sc.nextInt();    //input value from user
        System.out.println("your age is " + age + ".");
    }
}