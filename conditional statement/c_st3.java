import java.util.*;
public class c_st3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to check whether it is even or odd");
        int n=sc.nextInt();

        if (n%2==0){
            System.out.println("Entered Number is Even");
        }
        else{
            System.out.println("Entered Number is Odd");
        }
        sc.close();
    }
}
