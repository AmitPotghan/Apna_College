public class TEST2 {
    public static void bubble_sort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selection_sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            int minpos=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minpos] > arr[j]){
                    minpos=j;    //finding minimum position
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertion_sort(int arr[]){
        for (int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;   
        }
    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,6,2};
        insertion_sort(arr);
        print(arr);
        

    }
}
