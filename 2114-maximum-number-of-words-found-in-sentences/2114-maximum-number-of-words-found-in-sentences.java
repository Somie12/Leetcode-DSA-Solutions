class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        int ns=0;
        int l= sentences.length;
        String[] str = new String[100];
        for(int i=0;i<l;i++)
        {
        ans=0;
           str = sentences[i].split("\\s+");
           for(int j=0;j<str.length;j++)
           {
            ans++;
           }
           if (ans>ns)
           {
             ns=ans;
            }
        }
        return ns;
    }
}