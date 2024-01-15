class product{
    public static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        int a=10;
        int b=6;
        System.out.println(multiply(a,b));
        System.out.println(a);   //in java function is call by value not by reference
        System.out.println(b);


    }
}