import java.util.*;
public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Kolhapur");
        cities.add("Bangalore");

        //using iteractor interface
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //using enhanced for loop or for each loop
        for (String city:cities){
            System.out.println(city);
        }
    }
}
