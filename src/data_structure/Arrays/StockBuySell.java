package data_structure.Arrays;

import java.util.ArrayList;
import java.util.List;


public class StockBuySell {

    // Demo
    // The cost of a stock on each day is given in an array find the max profit that
    // you can buying and selling in those days.
    // Note : You can buy and sell stocks as many you as.

    // Input = {100,180,260,310,40,535,695}
    // Output : 865
    // Explanation : Buy the stock on day 0 and sell 3.(Profit gain = 210) Again buy on day 4 and sell
    // on day 6 (profit gain = 655), so total profit = 210 + 655 = 865.
    // Also try to get the stock buying days and selling days
    // lets' do it!

    public static void main(String[] args) {

        int[] stocksPrice = {100,180,260,310,40,535,695};
        int length = stocksPrice.length;
        List<StockInfo> stockInfoList = getList(stocksPrice,length);
        int maxProfit = maxProfit(stocksPrice,length);
        System.out.println("Max Profit : "+maxProfit);
        if (stockInfoList==null)
            System.out.println("Please do not buy any stocks, because it will give pain!");
        else{
            System.out.println("Stocks info : ");
            int i = 1;
            int profit = 0;
            for (StockInfo stockInfo : stockInfoList) {
                System.out.println("Buy day "+(i)+" : "+stockInfo.buyingDay);
                System.out.println("Sell day "+(i)+" : "+stockInfo.sellDay);
                System.out.println("Profit gain "+(i)+" : "+stockInfo.profit);
                profit+=stockInfo.profit;
                i++;
            }
            System.out.println("Total Profit : "+profit);
        }



    }

    private static List<StockInfo> getList(int[] stocksPrice, int length) {
        if (length <= 1)
            return null;
        int count = 0;
        List<StockInfo> result = new ArrayList<>();
        // approach : Find local minima and set to buyDay, and then get local maxima and set to sellDay
        int i = 0;
        while (i < length - 1){

            // check for local minima
            while ((i < length-1) && stocksPrice[i+1] <= stocksPrice[i])
                i++;
            if (i == length-1)
                break;

            StockInfo stockInfo = new StockInfo();
            stockInfo.buyingDay = i++;

            // find the local maxima
            while ((i < length)&& stocksPrice[i]>=stocksPrice[i-1])
                i++;

            stockInfo.sellDay = i-1;
            stockInfo.profit = stocksPrice[i-1] - stocksPrice[stockInfo.buyingDay];
            result.add(stockInfo);
            count++;
        }
        if (count == 0)
            return null;
        return result;

    }

    private static int maxProfit(int[] stocksPrice, int length){

        if (length <= 1)
            return 0;
        int maxProfit = 0;
        for (int i =1;i<length;i++){
            if (stocksPrice[i] > stocksPrice[i-1]){
                maxProfit += (stocksPrice[i] - stocksPrice[i-1]);
            }
        }
        return maxProfit;
    }
}

class StockInfo{
    int buyingDay;
    int sellDay;
    int profit;
}