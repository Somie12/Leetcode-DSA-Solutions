class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        char[] j = jewels.toCharArray();
        for(int i=0;i<j.length;i++ )
        {
            for(int k=0;k<stones.length();k++)
            {
                if(j[i]==stones.charAt(k))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}