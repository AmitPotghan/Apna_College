public class reverse_arr {
    public static void reverse_array(int arr[]){
        int start=0;
        int end=arr.length - 1;
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int number[]={10,20,30,40,50,60,70};
        reverse_array(number);
        System.out.println("Reversed Array:");
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }

        
    }
}
