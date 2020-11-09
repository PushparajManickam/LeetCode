class CountPrime {
    public int countPrimes(int n) {
        boolean[] b=new boolean[n+1];
        Arrays.fill(b,true);
        int loop, iterate,count=0;
        for(loop=2; loop*loop<=n; loop++){
            for(iterate=2*loop; iterate<=n;iterate=iterate+loop)
                b[iterate]=false;
    }
        for(loop=2;loop<n;loop++){
            if(b[loop])
                count++;
        }
        return count;
    }
}