public class majority_element {
    public static int major_element(int arr[]){
        int majorcount=arr.length/2;
        for (int i=0;i<arr.length;i++){
            int count=0;
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>majorcount){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(major_element(arr));
    }
}
