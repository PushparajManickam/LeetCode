class HappyNumber {
    public boolean isHappy(int n) {
        while(n>4 )
            n = sumSq(n);
        if(n==1)
            return true;
    return false;
    }
    public int sumSq(int nums){
        int sum=0;
        while(nums!=0){
            int remainder=nums%10;
            sum = sum + (remainder * remainder);
            nums=nums/10;
        }
        return sum;
    }
}