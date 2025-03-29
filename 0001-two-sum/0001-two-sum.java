class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap <Integer, Integer> hmap = new HashMap<>();


        int arr[] = new int[2];
        for(int i=0;i<n;i++)
        {
            int complement = target - nums[i];

            if(hmap.containsKey(complement))
            {
                 arr[0] = hmap.get(complement);
                 arr[1] = i;
            }

            hmap.put(nums[i], i);

            
        }
        
      return arr;
        
    }
}