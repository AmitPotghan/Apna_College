import java.util.*;
public class MajorityElement{
    public static void MajElement(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = arr.length;

        //Traversing Array
        for (int i=0;i<arr.length;i++){
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);  //Replace inner content of for loop using                                     
            // }else{                                  hm.put(arr[i],hm.getOrDefault(arr[i], defaultValue:0) + 1);
                hm.put(arr[i],1);
            }
        }
        for (Integer key:hm.keySet()){
            if (hm.get(key)>(n/3)){
                System.out.println(key);
            }
        }
        System.out.println(hm);
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        
        MajElement(arr);
    }
}