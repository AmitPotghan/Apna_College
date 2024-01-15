public class hw_Rat {
    public static boolean maze(int maze[][]){
        int n=maze.length;
        int sol[][]=new int[n][n];
        if (MazeSolver(maze,0,0,sol)==false){
            System.out.println("Solution doesn't exist");
            return false ;
        }
        printSolution(sol);
        return true;
    }
    public static void printSolution(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean issafe(int maze[][],int i,int j){
        if (i>=0 && i<maze.length  && j>=0 && j<maze.length && maze[i][j]==1){
            return true;
        }
        return false;
    }
    public static boolean MazeSolver(int maze[][],int i,int j,int sol[][]){
        //base case 
        if (i==maze.length-1 && j==maze.length-1 && maze[i][j]==1){
            sol[i][j]=1;
            return true;
        }
        
        //recursion
        
        //choices
        //To check current maze[i][j] is valid or not
        if (issafe(maze,i,j)== true){
            if (sol[i][j]==1){
                return false;
            }
            sol[i][j]=1;
            if (MazeSolver(maze, i, j+1,sol)){  //down move
                return true;
            }
            
            if (MazeSolver(maze,i+1,j,sol)){    //right move
                return true; 
            }
            sol[i][j]=0;
            return false;
        }
        return false;
        
    }
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 } };
        maze(maze);
    }
}
