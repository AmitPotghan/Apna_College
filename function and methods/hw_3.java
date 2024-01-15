import java.util.*;
public class hw_3 {
    public static void ispalindrome(int n){
        int orig=n;
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=rev *10 + lastdigit;
            n=n/10;
            
            System.out.println(rev);
        }
        if (orig == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to check Palindrome");
        int num=sc.nextInt();
        ispalindrome(num);
        sc.close();
    }
}
