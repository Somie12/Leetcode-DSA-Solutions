class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        

        int start = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{start, last};


    }


    int findFirst(int nums[], int target)
    {
        int low=0,high=nums.length-1;
        int mid=-1;
        int result=-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;

            if(target==nums[mid])
            {
                result = mid;
                high = mid-1;
            }
            else if(target>nums[mid])
            {
                low=mid+1;
            }
            else if(target<nums[mid])
            {
                high=mid-1;
            }
        }
        return result;

    }

     int findLast(int nums[], int target)
    {
        int low=0,high=nums.length-1;
        int mid=-1;
        int result=-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;

            if(target==nums[mid])
            {
                result = mid;
                low=mid+1;
            }
            else if(target>nums[mid])
            {
                low=mid+1;
            }
            else if(target<nums[mid])
            {
                high=mid-1;
            }
        }
        return result;
        
    }
}