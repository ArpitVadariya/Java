import java.util.*;
class Operations{
    String name;
    Scanner sc = new Scanner(System.in);
    public void Insert(){
        System.out.println("Enter name : ");
        name = sc.next();
    }
    public void Update(){
        System.out.println("Enter new name : ");
        name = sc.next();
    }
    public void Delete(){
        name = null;
        System.out.println("name deleted.");
    }
    public void View(){
        if(name == null){
            System.out.println("no name is availabel.");
        }else{
            System.out.println("name is " + name);
        }
    }
}
public class CRUD {
    public static void disp_choices() {
        System.out.println("Enter a choice from following conditions.");
        System.out.println("0. EXIT");
        System.out.println("1. INSERT");
        System.out.println("2. UPDATE");
        System.out.println("3. DELETE");
        System.out.println("4. VIEW");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();
        disp_choices();
        int choice = sc.nextInt();
        while (choice < 0 || choice > 4) {
            System.out.println("Please Enter Valid Choice");
            choice = sc.nextInt();
        }
        while (choice != 0) {
            switch (choice) {
                case 1:
                    // System.out.println("INSERT SELECTED");
                    op.Insert();
                    break;

                case 2:
                    // System.out.println("UPDATE SELECTED");
                    op.Update();
                    break;

                case 3:
                    // System.out.println("DELETE SELECTED");
                    op.Delete();
                    break;

                case 4:
                    // System.out.println("VIEW SELECTED");
                    op.View();
                    break;

                default:
                    System.out.println("");
            }
            disp_choices();
            choice = sc.nextInt();
            while (choice < 0 || choice > 4) {
                System.out.println("Please Enter Valid Choice");
                choice = sc.nextInt();
            }
        }
    }
}