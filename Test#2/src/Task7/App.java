package Task7;

import java.awt.desktop.AppForegroundListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Apple{
    public String toString(){
        return getClass().toString();
    }
}

public class App {
    public static void main(String... args){
        Integer[] intMore = new Integer[5];
        for (int i = 0; i < 5; i++)
            intMore[i] = i;

        List<Integer> appleList = new ArrayList<>();
        Collections.addAll(appleList, intMore);

        List<Integer> appleList1 = appleList.subList(1,3);
        System.out.println(appleList);

        System.out.println(appleList1);

        appleList.removeAll(appleList1);
        System.out.println(appleList);
    }
}
