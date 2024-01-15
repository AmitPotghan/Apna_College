public class friendspairing {
    public static int FriendPairing(int n){
        if (n==1 || n==2){
            return n;
        }
        int totalways=FriendPairing(n-1) + (n-1)*FriendPairing(n-2);
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(FriendPairing(3));
    }
}
