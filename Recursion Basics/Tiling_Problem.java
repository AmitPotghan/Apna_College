public class Tiling_Problem {
    public static int Tiling(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int VerticalTiles = Tiling(n-1);
        int HorizontalTiles = Tiling(n-2);
        int totalways=VerticalTiles + HorizontalTiles;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(Tiling(4));
    }
}
