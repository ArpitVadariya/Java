import java.util.*;

public class LLHONE {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);

        for(int i=0;i<list.size();i++){
            if(list.get(i) == 7){
                System.out.println("7 is on " + i + " index number.");
            }
        }
    }
}