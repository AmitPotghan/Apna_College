// For a given integer array of size N, you have to find all the occurrences (indices) of a given element (Key) 
// and print them. Use a recursive function to solve this problem.

public class assignment {
    public static void Occurence(int arr[],int key,int i){
        if (i == arr.length){
            return;
        }
        if (arr[i] == key){
            System.out.print(i+" ");
            Occurence(arr, key, i+1);
        }else{
            Occurence(arr, key, i+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5,2, 6, 2, 7, 2, 2};
        Occurence(arr, 2, 0);
    }
}
