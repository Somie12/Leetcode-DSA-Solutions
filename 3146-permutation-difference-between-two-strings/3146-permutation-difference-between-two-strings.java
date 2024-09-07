class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans =0;
        char ch=s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            ch = s.charAt(i);
            ans+= Math.abs(s.indexOf(ch)- t.indexOf(ch));
        }
        return ans;
    }
}