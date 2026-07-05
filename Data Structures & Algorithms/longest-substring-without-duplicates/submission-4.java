class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int i=0,j=0;
        int len = 0;
        while(j<s.length())
        {
            arr[s.charAt(j)]++;
            while(arr[s.charAt(j)]!=1)
            {
                arr[s.charAt(i)]--;
                i++;
            }
            len= Math.max(j-i+1,len);
            j++;
        }
        return len;
    }
}
