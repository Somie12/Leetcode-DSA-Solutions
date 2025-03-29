class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        
        int x=-1;
        for(int i=0;i<=n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                if(i==nums[j])
                {
                    flag=true;
                }            
            }
            if(flag==false)
            {
                x = i;
            }
        }
    
        return x;
    }
}