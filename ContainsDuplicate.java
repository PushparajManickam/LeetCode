class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int loop;
        Arrays.sort(nums);
        for(loop=0;loop<nums.length-1;loop++){
                if(nums[loop]==nums[loop+1])
                return true;
        }
        return false;
    }
}