class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target)
        {
            return 0;
        }
        else if(nums.length==1 && nums[0]!=target)
        {
            return -1;
        }
        else
        {

        
        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low<=high)
        {
           mid = low + (high-low)/2;
           if(target==nums[mid])
           {
               return mid;
           }
           else if(target<nums[mid])
           {
              high=mid-1;
           }
           else if(target>nums[mid])
           {
            low=mid+1;
           }
        }
        return -1;
        }
        

    }
}