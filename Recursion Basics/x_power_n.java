public class x_power_n {
    public static int power(int x,int n){
        if (n==0){
            return 1;
        }
        return x * power(x, n-1);
    }
    public static int OptimizedPower(int x,int n){
        if (n==0){
            return 1;      //still time complexity is O(n);
        }
        int halfPowersquare=OptimizedPower(x, n/2) * OptimizedPower(x, n/2);
        if (n%2!=0){
            halfPowersquare=x* halfPowersquare;
        }
        return halfPowersquare;
    }
    public static int OptimizedPower2(int x,int n){
        if (n==0){
            return 1;      //Time complexity is O(logn);
        }
        int halfPower=OptimizedPower(x, n/2);
        int halfPowersquare= halfPower * halfPower;
        if (n%2!=0){
            halfPowersquare=x* halfPowersquare;
        }
        return halfPowersquare;
    }
    public static void main(String[] args) {
        
        System.out.println(OptimizedPower2(2, 25));
    }
}
