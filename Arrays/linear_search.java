public class linear_search {
    public static int linear(int numbers[],int key){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int linear_search2(int arr[],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=1;

        int index=linear_search2(numbers, key);
        if (index == -1){
            System.out.println("The entered element is not present");
        }else{
            System.out.println("The element is present at index:"+index);
        }
        
    }
}
