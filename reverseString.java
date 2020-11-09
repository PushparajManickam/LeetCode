//344. Reverse String
class reverseString {
    public void reverseString(char[] s) {
     if(s.length == 0) return ;
        for(int loop=0;loop<s.length/2;loop++)
        {
            char temp           = s[s.length-loop-1];
            s[s.length-loop-1]  = s[loop];
            s[loop]             = temp;
        }
    }
}