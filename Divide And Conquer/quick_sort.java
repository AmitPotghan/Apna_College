public class quick_sort {
    public static void Quick_sort(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }
        int pIndx=partition(arr,si,ei);
        Quick_sort(arr, si, pIndx-1);
        Quick_sort(arr, pIndx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        
        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                //swap that is pivot se chote elements ek taraf
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //for placing pivot in rightplace in an array
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        //yaha mera pivot is equals to i 
        //that is pivot se chote elemts ke aage pivot isliye i;
        return i;
    }
    public static void PrintArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        Quick_sort(arr,0,arr.length-1);
        PrintArr(arr);
    }
}
