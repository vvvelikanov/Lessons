package Task10;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<String, String> map = new HashMap<>();
        map.put("бродяга", "dude");
        map.put("Калуга", "Kaluga");
        map.put("резьба", "thread");
        map.put("пульт", "menu");
        System.out.println(map);


       //Set<Map.Entry<String, String>> keys = map.entrySet();
        Map<String, String> treeMap = new TreeMap<String, String>(map);

        Map<String, String> linkedHashMap = new LinkedHashMap<>(treeMap);
        System.out.println(linkedHashMap + "\n");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("бродяга");
        hashSet.add("Калуга");
        hashSet.add("резьба");
        hashSet.add("пульт");
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);
        Set<String> linkedHashSet = new LinkedHashSet<>(treeSet);
        System.out.println(linkedHashSet);



    }
}
