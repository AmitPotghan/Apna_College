import java.util.ArrayList;
public class swapping {
    public static void swaping(ArrayList<Integer> list,int index1,int index2){
        int temp=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,temp);
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        //add element in ArrayList
        list.add(4);
        list.add(2);
        list.add(300);
        list.add(45);
        list.add(8);

        int index1=2,index2=3;
        System.out.println("Before swaping:"+list);
        swaping(list,index1,index2);
        System.out.println("After swapping value at index 0 and 4 we get:"+list);
        
    }
}
