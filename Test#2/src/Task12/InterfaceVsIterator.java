package Task12;
import java.util.*;
public class InterfaceVsIterator {
    public static void display(Iterator<Integer> it) {
        while (it.hasNext()) {
            Integer p = it.next();
            System.out.print(p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Integer> pets) {
        for (Integer p : pets)
            System.out.print(p.toString() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        display(c.iterator());
    }

}
