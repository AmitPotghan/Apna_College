public class binary_string {
    public static void Binary_String(int n,int LastPlace,String str){
        if (n==0){
            System.out.println(str);
            return;
        }
        Binary_String(n-1,0, str+"0");
        if (LastPlace == 0){
            Binary_String(n-1, 1, str+"1");
        }

    }
    public static void main(String[] args) {
        int n=3;
        Binary_String(n, 0, "");
    }
}
