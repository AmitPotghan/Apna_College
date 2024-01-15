import java.util.*;
public class lp_hw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int fact=1; 
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("The factorial of a Number is:"+fact);
    }
}
