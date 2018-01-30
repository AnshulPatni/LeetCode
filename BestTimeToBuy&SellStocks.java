class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        if(prices.length == 0)
            return 0;
        
        int buy_val = 0, sell_val = 0;
        int temp = 0;
        int flag = 0;
        
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i - 1] < prices[i])
            {
                if(buy_val == 0 && sell_val == 0)
                {
                    buy_val = prices[i - 1];
                    sell_val = prices[i];
                    temp = buy_val;
                }
                
                if(prices[i - 1] < temp)
                {
                    temp = prices[i - 1];
                    flag = 1;
                }
                if(prices[i] >= sell_val || (prices[i] - temp) > profit)
                {
                    sell_val = prices[i];
                    if(flag == 1)
                    {
                        flag = 0;
                        buy_val = temp;
                    }
                }
            }
            profit = sell_val - buy_val;
        }
        return profit;
    }
}