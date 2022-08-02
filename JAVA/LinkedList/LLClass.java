import java.util.*;

public class LLClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Ironman");
        list.addFirst("am");
        list.addFirst("I");
        System.out.println(list);
        list.add(2, "an");
        System.out.println(list);

    }
}
