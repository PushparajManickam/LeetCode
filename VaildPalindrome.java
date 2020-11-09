class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int first, last, size;
        String str = s.replaceAll("[^a-zA-Z0-9]","");  //specialcharacter is replaced to character
        str = str.toLowerCase();            //to lowercase
        size=str.length();                  //size
        first=0;
        last=size-1;
        while(first<last){
            if(str.charAt(first)!=str.charAt(last))
                return false;
            first++;
            last--;
        }
    return true;
    }
}