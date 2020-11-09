class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> myList = new ArrayList<>();
        int[][] arr= new int[numRows][numRows];
        int loop1, loop2, temp;
        for(loop1=0; loop1<numRows; loop1++){
            List<Integer> innerList = new ArrayList<>();
            for(loop2=0; loop2<=loop1; loop2++){
                if(loop1==loop2 || loop2==0){
                    temp = arr[loop1][loop2]=1;
                }
                else{
                    temp=arr[loop1][loop2]=arr[loop1-1][loop2-1]+arr[loop1-1][loop2];
                }
                innerList.add(temp);
            }
            myList.add(innerList);
        }
        return myList;
    }
}