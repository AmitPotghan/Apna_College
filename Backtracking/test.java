public class test{
    static int N=8;
    public static void PrintSolution(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean knight_board(){
        int sol=new int[8][8];
        for (int x=0;x<N;x++){
            for (int y=0;j<N;y++){
                sol[x][y]=-1;
            }
        }
        int xmove[]={2,1,-1,-2,-2,-1,1,2};
        int ymove[]={1,2,2,1,-1,-2,-2,-1};

        sol[0][0]=0;
    }
    public static void main(String[] args) {
        
    }
}