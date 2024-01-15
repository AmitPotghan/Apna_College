import java.util.Scanner;

public class lp_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Enter a Number:");
            n=sc.nextInt();
            if (n % 10 == 0){
                break;
            }
        }
        System.out.println("You have exited the loop");
        sc.close();
    }
}
