public class firstoccurence {
    public static int FirstOccurence(int arr[],int key,int i){
        if (i == arr.length-1){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,5,7,4,3,8,5,9};
        System.err.println(FirstOccurence(arr, 10, 0));

    }
}
