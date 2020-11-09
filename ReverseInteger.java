class ReverseInteger {
    public int reverse(int x) {
        long sum=0;
        while(x!=0){
            sum = (sum*10) + (x%10);
            x   = x/10;
        }
        if(sum<-2147483648 || sum>2147483647)
            sum=0;
        return (int) sum;
    }
}