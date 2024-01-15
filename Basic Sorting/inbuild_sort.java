import java.util.Arrays;   //here java.uil.* also include java.util.Arrays
import java.util.Collections;
public class inbuild_sort {
    public static void print_arr(Integer arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,3,6,1,2};
        //Arrays.sort(arr);

        //Arrays.sort(arr,0,3);
        //print_arr(arr);

        //for reverse order or descending order  for this we have to create object of eg Integer
        //Arrays.sort(arr,Collections.reverseOrder());
        //print_arr(arr);
        
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        print_arr(arr);

    }
}
