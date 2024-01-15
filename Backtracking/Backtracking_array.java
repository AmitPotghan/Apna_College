public class Backtracking_array{
    public static void Print_Arr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void change_Arr(int arr[],int i,int val){
        //Base case
        if(i==arr.length){
            Print_Arr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        change_Arr(arr,i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        change_Arr(arr, 0, 1);
        Print_Arr(arr);
    }
}