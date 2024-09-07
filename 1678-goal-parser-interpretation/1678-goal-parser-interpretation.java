class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();

        int l=command.length();
        int i=0;
        while(i<l)
        {
            if(i<l && command.charAt(i)=='G')
            {
                ans.append('G');
                i++;
            }
            else if(i+1<l && command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                ans.append('o');
                i+=2;
            }
            else if(i+3<l && command.charAt(i)=='(' && command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')' )
            {
                ans.append("al");
                i+=4;
            }
            else
            {
                i++;
            }
        }
        return ans.toString();
    }
}