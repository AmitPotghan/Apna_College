import java.util.ArrayList;
public class FindMax {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        //add element in ArrayList
        list.add(4);
        list.add(2);
        list.add(300);
        list.add(45);
        list.add(8);

        int max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
            if (list.get(i)> max){
                max=list.get(i);
            }
            //max=Math.max(max,list.get(i));
        }
        System.out.println(list);
        System.out.println(max);
    }
}
