import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China",150);
        lhm.put("Indonesia", 50);
        lhm.put("Pakistan",200);
        System.out.println(lhm);
    }
}
