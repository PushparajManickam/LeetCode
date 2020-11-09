class removeDuplicateInArray {
    public int removeDuplicates(int[] nums) {
        int loop,count=0;
        int size = nums.length;
        if(size==0 || size==1) return size;
        for(loop=0;loop<size-1;loop++)
            if(nums[loop]!=nums[loop+1])
                nums[count++] = nums[loop];
                //loop++;
        nums[count] = nums[size-1];
            return count+1;
    }
}