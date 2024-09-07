class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();

        boolean flag=false;
        for(int i=0;i<words.length;i++)
        {
            flag=false;
            for(int j=0;j<words[i].length();j++)
            {
                if(words[i].charAt(j)==x)
                {
                    flag =true;
                }
                
            }
            if(flag==true)
                {
                    indices.add(i);
                }
        }
        return indices;
    }
}