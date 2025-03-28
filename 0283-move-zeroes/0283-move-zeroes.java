class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1) return;
        
        int n = nums.length;
        int res[] = new int[n];
        int index=0,count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            else
            {
                res[index] = nums[i];
                index++;
            }
        }

        for(int i=index;i<n;i++)
        {
            res[i] = 0;
        }

        for(int i=0;i<n;i++)
        {
            nums[i] = res[i];
        }

    }
}