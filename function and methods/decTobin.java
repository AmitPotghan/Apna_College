public class decTobin {
    public static void dec_bin(int n){
        int binary=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            binary=binary+(rem  *  (int)Math.pow(10,pow));
            n=n/2;
            pow++;
            System.out.println(binary);
        }
        System.out.println("binary no:"+binary);
    }
    public static void main(String[] args) {
        dec_bin(4);
    }
}
