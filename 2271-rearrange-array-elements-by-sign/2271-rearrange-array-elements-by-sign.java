class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        
       
       
       int pos[] = new int[nums.length/2];
       int neg[] = new int[nums.length/2];
       int j=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos[j] = nums[i];
                j++;
            }
            else if(nums[i]<0)
            {
                neg[k] = nums[i];
                k++;
            }
        }
        int index=0;
        for(int l=0;l<nums.length/2;l++)
        {
            nums[index] = pos[l];
            nums[index+1] = neg[l];
            index=index+2;
        }

        return nums;
    }
}