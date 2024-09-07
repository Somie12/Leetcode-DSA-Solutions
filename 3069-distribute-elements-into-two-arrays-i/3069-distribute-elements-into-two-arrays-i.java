class Solution {
    public int[] resultArray(int[] nums) 
    {
        int n=nums.length;
        int arr1[]= new int[n];
        int arr2[] = new int[n];
        int result[] = new int[arr1.length + arr2.length];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int count1=1;
        int count2=1;

        for(int i=2;i<n;i++)
        {
            if(arr1[count1-1]>arr2[count2-1])
            {
                arr1[count1] = nums[i];
                count1++;
            }
            else
            {
                arr2[count2] = nums[i];
                count2++;
            }
        }
        arr1 = Arrays.copyOfRange(arr1, 0, count1);
        arr2 = Arrays.copyOfRange(arr2, 0, count2);

        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);
        int c=0;
        while(c<result.length && result[c]!=0)
        {
            c++;
        }
        result = Arrays.copyOfRange(result, 0, c);
        return result;

    }
}