class Stock1 {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        if(size == 0) return 0;
        int i, j, Max = 0;
        //brute force
        for(i=0; i<size-1; i++){
            if(prices[i]<prices[i+1])
             Max = Max + (prices[i+1]-prices[i]);
            }
    return Max;
    }
}