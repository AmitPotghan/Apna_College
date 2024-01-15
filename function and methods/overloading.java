public class overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=3;
        int b=3;
        int c=3;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}
