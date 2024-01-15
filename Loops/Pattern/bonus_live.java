public class bonus_live {
    public static void num_pyramid(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindrome_pyramid(int n){
        for (int i=1;i<=n;i+=1){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            if(1+1+1+1+1 == 5){
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //num_pyramid(5);
        palindrome_pyramid(5);
    }
}
