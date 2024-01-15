public class merge_sort{
    public static void Merge_sort(int arr[],int si,int ei){
        //Base case
        if (si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        Merge_sort(arr, si, mid);//left part
        Merge_sort(arr, mid+1, ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        } 
        //bacha hua copy karne ke liye
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy from temp to original array

        for (k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        
    }
    public static void print_arr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,-2,8};
        Merge_sort(arr,0,arr.length-1);
        print_arr(arr);
        
    }
}