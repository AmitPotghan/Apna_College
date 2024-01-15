import java.util.*;
public class StackPractise{
    //Approach :1 Bruteforce O(n^2)
    public static void nextGreater(int arr[]){
        int newarr[]=new int[5];
        
        for (int i=0;i<arr.length;i++){
            int j=i+1;
            boolean flag=true;
            while(j<arr.length && flag==true){
                if (arr[i]<arr[j]){
                    newarr[i]=arr[j];
                    flag=false;
                }else{
                    newarr[i]=-1;
                }
                j++;
            }
        }
        newarr[arr.length-1]=-1;
        printArr(newarr);
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        nextGreater(arr);
        Stack<Integer>s=new Stack<>();
        System.out.println(s.peek());
        
    }
}