import java.util.*;
public class max_stockprofit {
    public static void main(String args[]){
        int prices[] = {7,6,4,3,1};
        int a = stockprofit(prices);
        System.out.println(a);
    }
    public static int stockprofit(int prices[]){
        int buyprice = prices[0];
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice = prices[i];
            } else{
                int profit = prices[i]-buyprice;
                if (profit>maxprofit){
                   maxprofit = profit;
                }
            }

        } return maxprofit; 
        
    }

}
    