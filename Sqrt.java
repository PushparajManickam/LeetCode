class Sqrt {
    public int mySqrt(int nums) {
        if(nums==0 || nums==1) return nums;
        int Start=1, End=nums;
        while(Start<=End){
            int mid = Start + (End-Start)/2;
            if(mid>nums/mid){       //mid * mid
                End = mid;
            }
            else{
                if(mid+1>nums/(mid+1))
                    return mid;
                    Start = mid;
            }
        }
        return Start;
    }
}