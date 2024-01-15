public class transpose {
    public static void transpose_arr(int arr[][]){

        int transpose_matrix[][]=new int[arr[0].length][arr.length];


        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                transpose_matrix[j][i]=arr[i][j];
            }
        }
        System.out.println("After Transpose:");
        print(transpose_matrix);
    }
    public static void print(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        print(arr);
        transpose_arr(arr);
        
    }
}
