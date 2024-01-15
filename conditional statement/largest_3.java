public class largest_3 {
    public static void main(String[] args) {
        int a=56,b=99,c=45;
        if (a>b){
            if (a>c){
                System.out.println("Greatest number:"+a);
            }
            else{
                System.out.println("Greatest Nubmer:"+c);
            }
        }
        else{
            if (b>c){
                System.out.println("Greatest Number:"+b);
            }
            else{
                System.out.println("Greatest Nubmer:"+c);
            }
        }
    }
}
