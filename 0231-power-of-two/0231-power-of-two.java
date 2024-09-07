class Solution {
    public boolean isPowerOfTwo(int n) {
        // for(int i=0;i<=30;i++)
        // {
        //     int res = (int)Math.pow(2,i);
        //     if(res == n)
        //     {
        //         return true;
        //     }
        // }
        // return false;
        
        
        
        
        
//         if(n>0 && (n & (n-1)) == 0)
//         {
//             return true;
//         }
        
//         return false;
        
        
        
        
        
        int res=1;
        for(int i=0;i<=30;i++)
        {
            if(res==n)
            {
                return true;
            }
            if(res<Integer.MAX_VALUE/2)
            {
                res=res*2;
            }
            
        }
        return false;
    }
}