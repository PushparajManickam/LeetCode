class singleNumber {
    public int singleNumber(int[] nums) {
      int single=0, loop, size, condition=1;
        size = nums.length;
        Arrays.sort(nums);
       for(loop=0;loop<size;++loop)
       {
           if(loop == size-1 && condition ==1)
           {
               single = nums[loop];
           }
           else if(nums[loop] == nums[loop+1])
           {
               ++loop;
           }
           else if(nums[loop]!=nums[loop+1])
           {
               condition=0;
               if(nums[loop+1]==nums[loop+2])
               single = nums[loop];
           }
       }
        return single;
    }
}