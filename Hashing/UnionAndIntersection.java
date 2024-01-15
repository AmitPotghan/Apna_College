import java.util.*;
public class UnionAndIntersection {
    public static int Union(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.println(set);
        for (int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
    public static int Intersection(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> count = new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        
        for (int i=0;i<arr2.length;i++){
            if (set.contains(arr2[i])){
                count.add(arr2[i]);
            }
        }
        
        // int count=0;
        // for (int i=0;i<arr2.length;i++){
        //     if (set.contains(arr2[i])){
        //         count++;
        //         set.remove(arr2[i]);
        //     }
        // }
        // return count;
        
        return count.size();
    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4,7};
        System.out.println("Union:"+Union(arr1,arr2));
        System.out.println("Intersection:"+Intersection(arr1,arr2));
    }
}
