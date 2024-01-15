import java.util.*;
public class HashMapOperation{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //put operation =>used to add O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US", 70);
        hm.put("India",120);
        System.out.println(hm);

        //get ==> O(1)
        int population = hm.get("India");
        System.out.println("Population of India is:"+population);
        System.out.println("Population of Indonesia:"+hm.get("Indonesia"));

        //containsKey ==> O(1) 
        System.out.println(hm.containsKey("US"));
        System.out.println(hm.containsKey("Indonesia"));

        //remove ==> O(1)
        hm.remove("China");
        System.out.println(hm);

        //size() ==>Returns size of HashMap
        System.out.println("Size of HashMap is :"+hm.size());

        //isEmpty
        System.out.println("Does HaspMap is Empty ? :"+hm.isEmpty());

        hm.clear();
        System.out.println("Does HaspMap is Empty,after hm.clear() function :"+hm.isEmpty());

    }
}