import java.util.Scanner;

public class hollow_rect {
    public static void hollowrect(int row,int col){
        for(int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if (i==1 || j==1 ||i ==row ||j==col ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the no of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the no of column:");
        int col=sc.nextInt();

        hollowrect(row,col);
        sc.close();
    }
}
