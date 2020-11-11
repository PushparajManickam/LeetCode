class MajorElement {
    public int majorityElement(int[] nums) {
        int loop1, loop2, n, major, count=0,tempcount;
        n=nums.length;
        major = nums[0];
        for(loop1=0;loop1<n;loop1++)
        {
            tempcount=0;
            for(loop2=loop1+1;loop2<n;loop2++){
              if(nums[loop1]==nums[loop2])
                    tempcount++;
            }
            if(count<tempcount){
                count = tempcount;
                major = nums[loop1];
            } 
        }
        return major;
    }
}
