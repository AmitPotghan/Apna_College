import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        //add element in ArrayList
        list.add(4);
        list.add(2);
        list.add(300);
        list.add(45);
        list.add(8);
        System.out.println("Before Sorting:"+list);
        Collections.sort(list);
        System.out.println("After Sorting:"+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
