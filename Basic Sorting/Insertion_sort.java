public class Insertion_sort {
    public static void insertion_sort(int arr[]){
        //finding correct position
        for (int i=1;i<arr.length;i++){
            int curr=arr[i];        //current positon or first element in unsorted array
            int prev=i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion at right position
            arr[prev+1]=curr;    //we use prev+1 bcoz while comparing prev right position se ek index piche hoga 
                                  // that's why we use prev+1
        }
    }
    public static void print_arr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={9,4,19,3,2};
        insertion_sort(numbers);
        print_arr(numbers);
        
    }
}
