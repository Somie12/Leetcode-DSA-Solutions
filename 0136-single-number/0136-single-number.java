class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=0;i<nums.length;i++)
        {
            xor ^= nums[i];
        }

        return xor;
    }
}