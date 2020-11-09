class RomanInteger {
    public int romanToInt(String s) {
       int loop, s1, s2, result =0, size = s.length();
        
       for(loop=0;loop<size;loop++){
           s1 = value(s.charAt(loop));
           if(loop+1<size){
               s2 = value(s.charAt(loop+1));
               if(s1<s2){
                  result = result + (s2 - s1);
                  loop++;
                   }
               else
                  result = result + s1;
           }
           
           else
                  result = result + s1;
            }
        return result;
    }
        int value(char c){
            if(c == 'I')
                return 1;
            if(c == 'V')
                return 5;
            if(c == 'X')
                return 10;
            if(c == 'L')
                return 50;
            if(c == 'C')
                return 100;
            if(c == 'D')
                return 500;
            if(c == 'M')
                return 1000;
        return -1;
        }
}