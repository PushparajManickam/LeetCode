class plusOne {
    public int[] plusOne(int[] digits) {
        int loop, size = digits.length;
       for(loop=size-1; loop>=0; loop--){
           if(digits[loop]<9){
               digits[loop]++;              //plus one
               return digits;               //then return array
           }
           else
               digits[loop]=0;              //current number is nine
       }
    int[] result = new int[size+1];         //for all number is nine.
    result[0] = 1;
    return result;
    }
}