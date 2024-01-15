public class counting_sort {
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int [largest + 1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for (int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print_arr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,1,4,3,2,6};
        countingsort(arr);
        print_arr(arr);
    }
}
