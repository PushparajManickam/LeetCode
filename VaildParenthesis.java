class ValidParenthesis {
    public boolean isValid(String s) {
     Stack<Character> stk = new Stack<>();
     int i;
     for(i=0; i<s.length(); i++){
                                            //open parentheses
         char c = s.charAt(i);
         if(c=='(' || c=='{' || c=='[')
             stk.push(c);
                                            //check if isEmpty
         if(stk.isEmpty())                  //someOpenParentheses are all pop
             return false;                  //CloseParentheses are presented so, false
                                            //close parentheses
         char temp;
         switch(c){
             case ')' : temp = stk.pop();
                        if(temp=='{' || temp=='[')
                            return false;
                            break;
             case '}' : temp = stk.pop();
                        if(temp=='(' || temp=='[')
                            return false;
                            break;
             case ']' : temp = stk.pop();
                        if(temp=='(' || temp=='{')
                            return false;
                            break;
         }
     }
        return stk.isEmpty();
    }
}