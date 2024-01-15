public class Search_in_rotated_array {
    public static int Search(int arr[],int target,int si,int ei){
        if (si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if (arr[mid]==target){
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            if (arr[si]<=target && target<=arr[mid]){
                return Search(arr, target, si, mid-1);
            }else{
                return Search(arr, target, mid+1, ei);
            }
        }
        //mid on L2
        else{
            if (arr[mid]<=target && target<=arr[ei]){
                return Search(arr, target, mid+1, ei);
            }else{
                return Search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,7,0,1,2};
        int target=2;
        System.out.println(Search(arr,target,0,arr.length-1));

    }
}
