class PowerOf3 {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        int max = (int) Math.pow(3,19);
    return max%n==0;
    }
}