class Insert2Array {
    public int[] intersect(int[] nums1, int[] nums2) {
       int temp=0, i=0, j=0, size1 = nums1.length, size2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<size1 && j<size2)
        {
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else if(nums1[i]==nums2[j]){
                nums1[temp++] = nums1[i];
                i++;
                j++;
            }
        }
        int[] result = Arrays.copyOf(nums1,temp);
        return result;
    }
}