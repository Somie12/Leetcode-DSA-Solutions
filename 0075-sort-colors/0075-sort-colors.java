class Solution {
    public void sortColors(int[] nums) 
    {
          int x=0,y=0,z=0;

          for(int i=0;i<nums.length;i++)
          {
              if(nums[i]==0)
              {
                 x++;
              }
              else if(nums[i]==1)
              {
                y++;
              }

              else
              {
                z++;
              }
          }


          for(int i=0;i<x;i++)
          {
             nums[i] = 0;
          }
          for(int j=x;j<x+y;j++)
          {
            nums[j] = 1;
          }
          for(int k=x+y;k<x+y+z;k++)
          {
             nums[k] = 2;
          }
    }
}