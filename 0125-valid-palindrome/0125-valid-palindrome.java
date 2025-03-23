class Solution {
    public boolean isPalindrome(String s) {
     if(s.equals(" "))
     {
        return true;
     }
        
       

       s =   s.toLowerCase().replaceAll("[\\p{Punct}\\s]+", "");
       String str_rev="";
       
       for(int i=s.length()-1;i>=0;i--)
       {
           str_rev+=(s.charAt(i));
       }

       if(s.equals(str_rev))
       {
         return true;
       }
      return false;
       

    }
}