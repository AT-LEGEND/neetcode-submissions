class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] pos = new int[128];
        int n = s.length();
        Arrays.fill(pos,-1);
        int left = 0, right = 0;
        int ans =0;
        while(left<n && right<n)
        {
            if(pos[s.charAt(right)]<left)
            {
                pos[s.charAt(right)]=right;
                right++;
            }
            else
            {
                ans = Math.max(ans,right-left);
                left= pos[s.charAt(right)]+1;
                pos[s.charAt(right)]=right;
                
                
                right++;
            }
        }
        ans = Math.max(ans,right-left);
        return ans;
    }
}
