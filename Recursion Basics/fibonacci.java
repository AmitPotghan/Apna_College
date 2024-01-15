public class fibonacci {
    public static int Fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int fib=Fibonacci(n-1) + Fibonacci(n-2);
        return fib;
    }
    public static void main(String args[]){
        int n=26;
        System.out.println(Fibonacci(n));

    }
}
