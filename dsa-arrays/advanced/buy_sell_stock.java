import java.util.*;
public class buy_sell_stock {
    public static void main(String args[]){
        int prices[] =  {7,1,5,6,3,4};
        int a = buyandsell(prices);
        System.out.println("Your max profit is: " + a);
        
    }
    public static int buyandsell( int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit  = Math.max(maxprofit,profit);
            }
            else{
                buyprice = prices[i];
                
            }
        } return maxprofit;
    }
    
}
