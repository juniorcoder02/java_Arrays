public class BuyAndSellStock {

    public static int BuyAndSellStock(int prices[]){ //time complexity = O(n);
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i =0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice; //today's profit
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(BuyAndSellStock(prices));

    }
    
}
 