package Task6;

import java.util.*;


public class App {
    public static void main(String...args){
        Collection<Gerbil> gerbils = new ArrayList<Gerbil>();

        for (int i = 0; i < 5; ++i)
            gerbils.add(new Gerbil(i));

        Iterator<Gerbil> it = gerbils.iterator();
        while (it.hasNext())
            it.next().hop();


        HashMap<Integer, Integer> collection = new HashMap<Integer, Integer>() {
        };
        for(int i = 0; i < 5; i++)
            collection.put(i, i+10);

        for(int i = 0; i < 5; i++)
            System.out.println(collection.get(i));
        System.out.println(collection);

        Map<Integer, Integer> coll = new LinkedHashMap<Integer, Integer>();
    }
}
