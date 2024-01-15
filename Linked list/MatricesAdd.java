public class MatricesAdd {
    
    public static void main(String[] args) {
        int M1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int M2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int Res[][]=new int[3][3];

        System.out.println("Result After Adding two Matrices and Making Diagonal elements Zero");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                Res[i][j]=M1[i][j] + M2[i][j];
                if (i==j){
                    Res[i][j]=0;
                }
            }
        }

        //for Printing
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(Res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
