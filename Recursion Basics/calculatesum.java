public class calculatesum {
    public static int Calculate_Sum(int n){
        if (n == 1){
            return 1;
        }
        int sum= n + Calculate_Sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Calculate_Sum(n));

    }
}
