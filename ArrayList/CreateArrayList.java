import java.util.ArrayList;
public class CreateArrayList{
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        //add element in ArrayList
        list.add(1);    //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0,9);        //onlu for these O(n)
        System.out.println((list));

        //deleting or remove element in an ArrayList;
        list.remove(0);         //O(n)
        System.out.println(list);


        //getting an element
        System.out.println(list.get(2));   //O(1)
        
        //setting an element
        list.set(3,10);     //O(n)
        System.out.println(list);;

        //contains an element
        //return true or false based on element present or absent

        System.out.println(list.contains(10));
        System.out.println(list.contains(99));              //O(n)
    }
}