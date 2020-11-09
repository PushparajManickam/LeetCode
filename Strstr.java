class Strstr {
    public int strStr(String haystack, String needle) {
        int loop, size1, size2, result=-1;
        size1=haystack.length();
        size2=needle.length();
        if(size1==0 && size2==0) return 0;
        for(loop=0;loop<=size1-size2;loop++){
            String sb = haystack.substring(loop,size2+loop);
            if(sb.equals(needle))
                return loop;
        }
        return result;
    }
}