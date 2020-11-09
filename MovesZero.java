class MovesZero {
    public void moveZeroes(int[] nums) {
        int loop, lp, count=0, size = nums.length;
        for(loop=0;loop<size;loop++)
        {
            if(nums[loop]!=0)
            {
                nums[count] = nums[loop];
                count++;
            }
        }
        for(lp=count;lp<size;lp++)
            nums[lp] = 0;
    }
}