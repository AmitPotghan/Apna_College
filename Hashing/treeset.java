import java.util.*;
public class treeset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Kolhapur");
        cities.add("Bangalore");
        System.out.println(cities);

        TreeSet<String> city = new TreeSet<>();
        city.add("Pune");
        city.add("Mumbai");
        city.add("Kolhapur");
        city.add("Bangalore");
        System.out.println(city);
    }
}
