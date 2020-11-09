class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>(n);
        String  s;
       for(int loop=1;loop<=n;loop++) 
       {
           if(loop%3==0 && loop%5==0)
               result.add("FizzBuzz");
           else if(loop%3==0)
               result.add("Fizz");
           else if(loop%5==0)
               result.add("Buzz");
           else
               {
               s = Integer.toString(loop);
               result.add(s);
               }
       }
        return result;
    }
}