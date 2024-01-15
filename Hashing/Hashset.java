import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(2);
        set.add(3);
        set.add(2); //not going to add in hashset as hashset doesn't allow duplicates
        System.out.println(set);

        if (set.contains(2)){
            System.out.println("Set contains 2");
        }
        // if (set.contains(5) == false){
        //     System.out.println("Set doesn't contain 5");
        // }
        System.out.println("After removing 2");
        set.remove(2);
        if (set.contains(2)){
            System.out.println("Set contains2");
        }else{
            System.out.println("Set doesn't contain 2");
        }
        System.out.println("The size of set is :"+set.size());
        System.out.println("After clearing set");
        set.clear();
        System.out.println("The size of set is :"+set.size());
        System.out.println("Does set is Empty? :"+set.isEmpty());
      
    }
}
