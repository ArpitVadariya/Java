import java.util.*;

public class LLHTWO {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("How many numbers would you want to enter : ");
        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            list.addLast(rd.nextInt(15));
        }
        System.out.println("Before deleting");
        System.out.println(list);
        System.out.print("Enter Minimum value : ");
        int min = sc.nextInt();
        System.out.print("Enter Maximum value : ");
        int max = sc.nextInt();

        for(int i=0;i<list.size();i++){
            if(list.get(i) >= min && list.get(i) <= max){
                list.remove(i);
                i--;
            }
        }
        System.out.println("After");
        System.out.println(list);
    }
}