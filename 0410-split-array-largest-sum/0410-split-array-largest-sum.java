class Solution {
    
    boolean isPossible(int[] nums, int k, int mid)
    {
        int n = nums.length;
        int subArrayCount = 1;
        int currentSum = 0;
        
        for(int i=0;i<n;i++)
        {
            if(currentSum + nums[i] <=mid)
            {
                currentSum += nums[i];
            }
            else
            {
                subArrayCount++;
                if(subArrayCount >k || nums[i]>mid)
                {
                    return false;
                }
                currentSum = nums[i];
            }
        }
        return true;
    }
    
    
    
    public int splitArray(int[] nums, int k) 
    {
        int start=0;
        int sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int end = sum;
        int ans=-1;
        int mid = start + (end-start)/2;
        
        while(start<=end)
        {
            if(isPossible(nums, k , mid))
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
    
}