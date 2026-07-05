class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] suf = new int[n];
        int[] pre = new int[n];
        int[] ans = new int[n];

        int pro = 1;
        for(int i =0;i<n;i++)
        {
            pre[i]=pro;
            pro*=nums[i];
        }
        pro=1;
        for(int i =n-1;i>=0;i--)
        {
            suf[i]=pro;
            pro*=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=pre[i]*suf[i];
        }
        return ans;
    }
}  
