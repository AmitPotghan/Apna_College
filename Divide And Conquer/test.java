public class test{
    public static int search(int arr[],int key){
        int si=0;
        int ei=arr.length-1;

        while(si<=ei){
            int mid=si+(ei-si)/2;
            if (arr[mid] == key){
                return mid;
            }
            //mid on L1
            if (arr[si]<=arr[mid]){
                if (arr[si]<=key && key<=arr[mid]){
                    ei=mid-1;
                }else{
                    si=mid+1;
                }
            }
            //mid on L2
            else{
                //on right
                if (arr[mid]<=key && key<=arr[ei]){
                    si=mid+1;
                }
                //on left
                else{
                    ei=mid-1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,5));
    }
}