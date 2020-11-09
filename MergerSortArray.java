class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0, loop=0;
        int[] arr=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j])
                arr[loop++] = nums1[i++];   
            else
                arr[loop++] = nums2[j++];
        }
        while(i<m)
            arr[loop++] = nums1[i++];
        while(j<n)  
            arr[loop++] = nums2[j++];
            for(loop=0; loop<arr.length; loop++)
            nums1[loop] = arr[loop];
        }
    }
