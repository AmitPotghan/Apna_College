
public class prime {
    public static int isprime(int n){
        if (n==1){
            System.out.println("Not Prime number");
            return 0;
        }
        int flag=0;
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int n=19;
        isprime(n);

    }

}
