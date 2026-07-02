package DSA.Arrays.Medium.OldTry;
import java.util.*;
public class stock_buy_sell {
    public static int maxprofit(int prices[]){
        int max_profit=0;
        int min= Integer.MAX_VALUE;
         for(int i = 0 ; i < prices.length; i++){
             if(min>prices[i]){
                 min=prices[i];
             }
              int profit= prices[i]-min;
              max_profit= Math.max(profit,max_profit);
         }
         return max_profit ;
    }
    public static void main ( String args[]){
        int prices[]={10, 7, 5, 8, 11, 9};
        int max_profit=maxprofit(prices);
        System.out.print("max profit is :"+max_profit);

    }
}
