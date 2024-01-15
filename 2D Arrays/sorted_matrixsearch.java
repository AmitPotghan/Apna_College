public class sorted_matrixsearch {
    public static boolean staircase_search(int arr[][],int key){
        int row=0;int col=arr[0].length-1;       //top right corner first cell value start
        while(row<arr.length && col>=0){         //that's why col will decrease and row will increase
            if (key==arr[row][col]){
                System.out.println("Found key at location:"+row+","+col);
                return true;
            }
            else if (key>arr[row][col]){
                //move bottom
                row++;
            }
            else{
                //move left
                col--;
            }
        }
        System.out.println("Key Not found!");
        return false;
    }
    public static boolean staircase_search2(int arr[][],int key){
        int col=0,row=arr[0].length-1;
        while(col<arr[0].length && row>=0){
            if (key==arr[row][col]){
                System.out.println("Key is found at location "+row+","+col);
                return true;
            }
            else if (key>arr[row][col]){
                col++;
            }
            else{
                row--;
            }
        }
        System.out.println("Key Not found!");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=50;
        staircase_search(arr, key);

    }
}
