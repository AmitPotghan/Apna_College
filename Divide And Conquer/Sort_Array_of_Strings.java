public class Sort_Array_of_Strings {
    public static void merge_sort(String arr[],int si,int ei){
        //Base Case
        if (si>=ei){
            return;
        }
        //kaam;
        int mid=si+(ei-si)/2;
        merge_sort(arr, si, mid);//left part
        merge_sort(arr, mid+1, ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if (arr[i].compareTo(arr[j])<0){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for (k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void Print_Arr(String arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        System.out.println("Array after sorted manner:");
        merge_sort(arr, 0, arr.length-1);
        Print_Arr(arr);

    }
}
