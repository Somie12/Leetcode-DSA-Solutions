class Solution {
    public int lengthOfLastWord(String s)
    {
        int length = s.length();
        int x=0;
        int i=length-1;
        //To handle trailing spaces
        while(i>=0 &&  s.charAt(i)==' ')
        {
            i--;
        }
        
        while(i>=0 && s.charAt(i)!= ' ')
        {
            x++;
            i--;
        }

        return x;
    }
}