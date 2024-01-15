public class inverted_pyramid {
    public static void inv_pyramid(int n){
        for (int i=1;i<=n;i++){
            int k=1;
            for (int j=5;j>=i;j--){        //also from j=1;j<n-i+1; is valid 
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_pyramid(5);
    }
}
