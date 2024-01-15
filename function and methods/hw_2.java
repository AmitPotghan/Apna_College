import java.util.*;
public class hw_2 {
    public static boolean iseven(int n){
        if (n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int c=sc.nextInt();
        if (iseven(c)){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
        sc.close();
    }
}
