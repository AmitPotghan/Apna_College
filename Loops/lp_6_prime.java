import java.util.*;
public class lp_6_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Entered a Number:");
        int n=sc.nextInt();
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i == 0){                                  //10=1*10  2*5  5*2   10*1
                flag=1;                                     //after 5*2 there are no unique pair these pair repeated
                                                            //so we optimize our code by running loop 2 to root n
            }
        }
        if (flag==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
        sc.close();
    }
}
