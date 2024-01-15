public class Selection_sort {
    public static void selection_sort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int min_pos=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[min_pos] > arr[j]){
                    min_pos=j;
                }
            }
            int temp=arr[min_pos];
            arr[min_pos]=arr[i];
            arr[i]=temp;
        }
    }
    
    public static void print_arr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={6,7,3,5,9};
        selection_sort(numbers);
        print_arr(numbers);
    }
}
