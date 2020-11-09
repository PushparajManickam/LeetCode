class Stock2 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
         int i, j,  size = prices.length;
         int  Max = 0;
        for(i=0; i<size; i++){
             for(j=i+1; j<size; j++){
                int current = prices[j] - prices[i];
                if(current>Max)
                   Max = current;
                 }
             }   
        
    return Max;
    }
}