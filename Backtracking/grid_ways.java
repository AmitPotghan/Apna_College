public class grid_ways {
    public static int GridWays(int i,int j,int row,int col){
        //base case
        if (i==row-1  &&  j==col-1){
            return 1;    //condition for last cell or Target
        }else if(i==row || j==col){
            return 0;
        }
        //two choices
        int w1=GridWays(i,j+1,row,col);
        int w2=GridWays(i+1,j, row, col);
        return w1+w2;
    }
    public static void main(String []args){
        int row=10,col=10;
        System.out.println("Total no of ways:"+GridWays(0, 0, row, col)); 
    }
}
