import java.util.ArrayList;
public class sizeofArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(12);

        System.out.println(list.size());    //size() is an inbuild function which returns size of ArrayList

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
