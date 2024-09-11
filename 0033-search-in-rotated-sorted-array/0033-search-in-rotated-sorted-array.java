class Solution {
    int findPivotIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    
    int binarySearch(int[] nums, int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int pivot = findPivotIndex(nums);
        
       
        if (target >= nums[pivot] && target <= nums[nums.length - 1])
        {
            return binarySearch(nums, pivot, nums.length - 1, target);
        } 
        else if (pivot > 0 && target >= nums[0] && target <= nums[pivot - 1]) 
        { 
           
            return binarySearch(nums, 0, pivot - 1, target);
        } 
        else if (pivot == 0) 
        {
            
            return binarySearch(nums, 0, nums.length - 1, target);
        } 
        else
        {
            return -1;
        }
    }
}
