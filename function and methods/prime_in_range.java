import java.util.*;
class prime_in_range{
    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int n){
        for (int i=2;i<n;i++){
            if (isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number for prime in a range:");
        int num=sc.nextInt();
        primeinrange(num);
        sc.close();
    }
}
