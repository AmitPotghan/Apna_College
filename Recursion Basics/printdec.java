public class printdec{
    public static void PrintDec(int n){
        //Base case
        if (n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n +" ");
        PrintDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        PrintDec(n);
    }
}
 
