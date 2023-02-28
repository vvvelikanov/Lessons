package Task9;

import Task6.Gerbil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilHashMap = new HashMap<>();
        gerbilHashMap.put("first", new Gerbil(5));
        gerbilHashMap.put("second", new Gerbil(4));
        gerbilHashMap.put("third", new Gerbil(8));
        Iterator<String> gerbilIt = gerbilHashMap.keySet().iterator();
        while (gerbilIt.hasNext()){
            String key = gerbilIt.next();
            System.out.print(key + " ");
            gerbilHashMap.get(key).hop();
        }
    }
}
