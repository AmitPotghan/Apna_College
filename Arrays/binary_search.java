public class binary_search {
    public static int binary_sear(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if (numbers[mid]==key){
                return mid;
            }
            if(numbers[mid] < key){
                start=end-1;
            }else{
                end=end-1;
            }
        }
        return -1;

    }
    public static int binary_search2(int arr[],int key){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,35,55,65,85};
        int key=85;
        System.out.println("The index of key Entered is:"+binary_search2(numbers,key));
        
    }
}
