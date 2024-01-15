public class sudoku_solver {
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //column
        for (int i=0;i<9;i++){
            if (sudoku[i][col] == digit){
                return false;
            }
        }
        //row
        for (int j=0;j<9;j++){
            if (sudoku[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for (int i=sr;i<sr+3;i++){
            for (int j=sc;j<sc+3;j++){
                if (sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void PrintSudoku(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean SudokuSolver(int sudoku[][],int row,int col){
        //base case
        if (row == 9){
            return true;
        }

        int nextrow=row;
        int nextcol=col+1;
        if (col+1 ==9){
            nextrow=row+1;
            nextcol=0;
        }
        //recusion
        if (sudoku[row][col]!=0){
            return SudokuSolver(sudoku, nextrow, nextcol);
        }
        for (int digit=1;digit<=9;digit++){
            if (isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if (SudokuSolver(sudoku, nextrow, nextcol)){
                    return true;
                }
                sudoku[row][col]=0;
                
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int sudoku[][]={{4,0,0,8,0,0,1,0,0},
        {0,1,0,0,0,0,3,0,0},
        {7,0,0,0,9,6,0,0,0},
        {8,0,0,6,0,0,0,4,0},
        {0,0,0,0,5,0,0,0,0},
        {0,3,1,0,0,0,0,7,2},
        {3,0,0,0,0,0,9,0,0},
        {0,6,2,0,0,0,4,0,0},
        {0,0,0,4,0,0,0,6,0}};
        
        if (SudokuSolver(sudoku, 0, 0)){
            PrintSudoku(sudoku);
        }else{
            System.out.println("Solution doesn't exist !!!");
        }
    }
}
