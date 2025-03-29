class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = (n*(n+1))/2;
        int sumNums = 0;
        for(int i=0;i<n;i++)
        {
            sumNums += nums[i];
        }

        if(sum-sumNums==0)
        {
            return 0;
        }

        else
        {
            return (sum-sumNums);
        }
            
        

        
        
    }
}