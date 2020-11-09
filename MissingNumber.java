class MissingNumber {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        for(int loop=0; loop<size; loop++){
            if(nums[loop] != loop)
                return loop;
        }
        return size;
    }
}