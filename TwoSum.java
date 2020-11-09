class Solution {
    public int[] twoSum(int[] nums, int target) {
        int loop, loop1, size = nums.length;
        int[] temp = new int[2];
        for(loop=0;loop<size-1;loop++){
            for(loop1=loop+1;loop1<size;loop1++){
                if(nums[loop]+nums[loop1] ==  target){
                    temp[0] = loop;
                    temp[1] = loop1;
                }
            }
        }
        return temp;
    }
}
/*
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/