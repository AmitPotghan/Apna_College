import java.util.*;
public class indianCoins {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,200,500,2000};
        int amount=1090;
        Arrays.sort(coins);
        Arrays.sort(coins);

        int count=0;
        for (int i=coins.length-1;i>=0;i--){
            if (coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total no of Coins to make Change is:"+count);
    }
}
