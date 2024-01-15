public class lastoccurence {
    public static int LastOccurence(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        int isfound=LastOccurence(arr, key, i+1);
        if (isfound == -1 && arr[i] == key){
            return i;
        } 
        
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={5,4,5,6,7,3};
        System.out.println(LastOccurence(arr, 5, 0));
    }
}
