class Solution {
    public int characterReplacement(String s, int k) {
        int i=0, j=0;
        int arr[] = new int[26];
        int maxfreq=0;
        int ans = 0;
        while(j<s.length())
        {
            arr[s.charAt(j)-'A']++;
            if(arr[s.charAt(j)-'A']> maxfreq)
                maxfreq=arr[s.charAt(j)-'A'];
            while(j-i+1>k+maxfreq)
            {
                arr[s.charAt(i)-'A']--;

                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}
