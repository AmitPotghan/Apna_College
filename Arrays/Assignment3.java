public class Assignment3 {
    public static int buyAndSellStocks(int prices[]){
        int buyingprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for (int i=0;i<prices.length;i++){
            if (buyingprice < prices[i]){
                //profit hoga;
                int profit=prices[i] - buyingprice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyingprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,6,4,3,1};
        System.out.println("The Maximum Profit is:"+buyAndSellStocks(prices));

    }
}
