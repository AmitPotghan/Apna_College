import java.util.*;
public class binomial {
    public static int  fact(int n) {
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int bino_coeff(int n,int r){
        int a=fact(n)/(fact(r)*fact(n-r));
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        System.out.println("Enter the value of r:");
        r=sc.nextInt();
        System.out.println("The value of binomial coefficient is :");
        System.out.println(bino_coeff(n,r));

        
        sc.close();
    }
}
