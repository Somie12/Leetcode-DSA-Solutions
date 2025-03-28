class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        
        k=k%n;
        reverseArr(nums, 0, n-1);

        reverseArr(nums, 0, k-1);
        reverseArr(nums, k, n-1);
        
    }

    public void reverseArr(int arr[], int start, int end)
    {
        int temp;
        while(start<end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}