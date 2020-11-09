class FactorialWithZeroes {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
        n = n/5;            //how many five there
        count = count + n;  //add noOf_five if(25) 5timesOf5+no5
        }
    return count;
    }
}