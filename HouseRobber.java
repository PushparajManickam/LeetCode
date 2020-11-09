class HouseRobber {
    public int rob(int[] nums) {
        int loop, first, second, current=0, size=nums.length;
        if(size==0) return 0;
        if(size==1) return nums[0];
        if(size==2) return Math.max(nums[0], nums[1]);
        first   = nums[0];
        second  = Math.max(nums[0],nums[1]);
        for(loop=2; loop<size; loop++){
            current = Math.max(second,first+nums[loop]);
            first   = second;
            second  = current;
        }
        return current;
    }
}