class firstUniqueCharacter {
    public int firstUniqChar(String s) {
        int loop1, loop2, count, size = s.length();
        char[] arr = new char[26];
        for(loop1=0;loop1<size;loop1++){
            count=0;
            for(loop2=0;loop2<size;loop2++){
                if(loop1!=loop2 && s.charAt(loop1) == s.charAt(loop2)){
                    count++;
                    break;
                }
            }
            if(count==0)
                return loop1;
        }
        
        return -1;
    }
}