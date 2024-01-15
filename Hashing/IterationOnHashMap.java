import java.util.*;
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("Indonesia", 50);
        hm.put("Pakistan",200);
        System.out.println(hm);

        Set<String>keys = hm.keySet();
        for (String k : keys) {
            System.out.println(k+":"+hm.get(k));
        }
    }
}
