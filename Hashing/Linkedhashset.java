import java.util.*;
public class Linkedhashset{
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Kolhapur");
        cities.add("Bangalore");
        System.out.println(cities);

        
        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("Pune");
        lhs.add("Mumbai");
        lhs.add("Kolhapur");
        lhs.add("Bangalore");
        System.out.println(lhs);
    }
}