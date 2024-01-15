public class towerofHanoi_ass5 {
    public static void TowerOfHanoi(int n,String src,String helper,String dest){
        if (n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        TowerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=5;
        TowerOfHanoi(n, "S", "H","D");
    }
}
