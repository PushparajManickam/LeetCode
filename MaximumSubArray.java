class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int loop, max , sum, size=nums.length;
        max=nums[0];
        sum=nums[0];
        if(size==1) return max;
        for(loop=1;loop<size;loop++){
            if(sum<0)
                sum=nums[loop];
            else
                sum=sum+nums[loop];
            if(sum>max)
                max=sum;
        }
        return max;
    }
}