class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int[] ans = new int[nums.length];
        int c0=0;
        for(int i: nums)
        {
            
            if(i!=0)
                pro*=i;
            else
            {
                c0++;
                if(c0==2)
                    return ans;
            }
        }
        for(int i =0; i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                ans[i]=pro;
                continue;
            }
            if(c0==0)
                ans[i]=pro/nums[i];
            else
                ans[i]=0;
        }
        return ans;
    }
}  
