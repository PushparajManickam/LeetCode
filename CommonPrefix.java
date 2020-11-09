class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result ="";
        if(strs.length==0) return result;
        int i, j;
        for(i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);     //f,l,o,w,e,r
            for(j=1; j<strs.length; j++){   //strs[1], strs[2],...strs[n]
                //vertical scanning [1][0], [2][0] isEqualTo [0][0]
                if(i!=strs[j].length() || strs[j].charAt(i) != c)
                    return result;
            }
            result = result + c;
        }
        return result;
    }
}