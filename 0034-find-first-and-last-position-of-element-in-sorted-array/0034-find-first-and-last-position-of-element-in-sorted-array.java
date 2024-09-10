class Solution {
    
    int firstOcc(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        
        
        int ans=-1;
        
        while(start<=end)
        {
            int mid = (start + end) / 2;
            if(target==nums[mid])
            {
                ans = mid;
                end = mid-1;
            }
            else if(target>nums[mid])
            {
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
        }
        return ans;
        
    }
    
    
    int lastOcc(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        
        
        int ans=-1;
        
        while(start<=end)
        {
            int mid = (start + end) / 2;
            if(target==nums[mid])
            {
                ans = mid;
                start = mid+1;
            }
            else if(target>nums[mid])
            {
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
        }
        return ans;
        
    }
    
    
    public int[] searchRange(int[] nums, int target) 
    {
        int arr[] = new int [2];
        int first = firstOcc(nums, target);
        int last =  lastOcc(nums, target);
        arr[0] = first;
        arr[1] = last;
        return arr;
        
    }
}