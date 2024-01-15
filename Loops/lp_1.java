import java.util.*;
class lp_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        int sum=0;
        System.out.println("\nThe sum of n natural number is:");
        for (int j=1;j<=n;j++){
            sum=sum+j;
        }
        System.out.println(sum);
        sc.close();

    }
};