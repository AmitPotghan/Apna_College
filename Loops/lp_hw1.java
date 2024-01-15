import java.util.*;
public class lp_hw1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        int odd=0,even=0;
        int choice=1;
        while(choice==1){
            System.out.println("Enter a Number:");
            n=sc.nextInt();
            if (n % 2 == 0){
                even=even + n;
            }else{
                odd=odd+n;
            }
            System.out.println("Press 1 for continue or else press 0");
            choice=sc.nextInt();
        }
        System.out.println("The sum of Odd no is:"+odd);
        System.out.println("The sum of Odd no is:"+even);
    }

}
