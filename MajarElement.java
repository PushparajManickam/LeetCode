class MajorElement {
    public int majorityElement(int[] nums) {
        int temp, temp1, maxicount=nums[0], n, count=0,tempcount;
        n=nums.length;
        for(int loop1=0;loop1<n;loop1++)
        {
            tempcount=0;
            temp = nums[loop1];
            for(int loop2=loop1+1;loop2<n;loop2++){
              if(temp==nums[loop2])
                    tempcount++;
            }
            if(count<tempcount){
                count = tempcount;
                maxicount = temp;
            } 
        }
        return maxicount;
    }
}
