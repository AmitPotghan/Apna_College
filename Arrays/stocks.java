// buy and sell stocks to achieve maximum profit
public class stocks {
    public static int buyAndSellStocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if (buyprice < prices[i]){
                //profit hoga;
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String []args){
        int prices[]={7,1,5,4,6,3};
        System.out.println("The maximum profit can be achieve is:"+buyAndSellStocks(prices));
    }
}
