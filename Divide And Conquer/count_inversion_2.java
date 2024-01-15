public class count_inversion_2{
    public static int merge(int arr[],int si,int mid,int ei){
        int i=si;
        int j=mid;
        int k=0;
        int temp[]=new int[ei-si+1];
        int inverse_count=0;

        while(i<mid && j<=ei){
            if (arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                inverse_count+=(mid-i);

            }
        }
        while(i<mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for (i=si,k=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return inverse_count;
    }
    public static int merge_sort(int arr[],int si,int ei){
        int inverse_count=0;
        if (ei>si){
            int mid=si+(ei-si)/2;
            inverse_count=merge_sort(arr,si,mid);
            inverse_count+=merge_sort(arr, mid+1,ei);
            inverse_count+=merge(arr, si, mid+1, ei);
        }
        return inverse_count;
    }
    public static void main(String args[]){
        int arr[]={5,5,5,5,5};
        System.out.println(merge_sort(arr,0,arr.length-1));
    }
}