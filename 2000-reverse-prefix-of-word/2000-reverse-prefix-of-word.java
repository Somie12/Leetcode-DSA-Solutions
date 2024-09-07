class Solution {
    public String reversePrefix(String word, char ch) {
        String str;
        String ns="";
        int l = word.length();
        boolean flag =false;
        String st;
        for(int i=0;i<l;i++)
        {
            if(word.charAt(i)==ch)
            {
                str = word.substring(0,i+1);
                StringBuilder rev = new StringBuilder(str);
                rev.reverse();
                st = rev.toString();
                ns = st + word.substring(i+1);
                flag=true;
            }
            if(flag==true)
            {
                break;
            }
        }
        if(flag==false)
        {
            return word;
        }
        return ns;
    }
}