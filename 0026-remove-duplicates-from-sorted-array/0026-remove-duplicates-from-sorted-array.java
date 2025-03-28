class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int index=1;
        
        int n = nums.length;
        
        
        for(int i=1;i<n;i++)
        {
           if(nums[i]!= nums[i-1])
           {
              nums[index]= nums[i];
              index++;
              
           }
        }
        return index;
    }
}