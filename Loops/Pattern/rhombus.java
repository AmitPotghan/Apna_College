public class rhombus {
    public static void rho(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void solidrhombus(int n){
        for (int i=1;i<=n;i++){

            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=n;j++){
                if (j == 1 || j == n || i==1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
            
        }
        

    }
    public static void main(String[] args) {
        //rho(6);
        solidrhombus(6);
    }
}
