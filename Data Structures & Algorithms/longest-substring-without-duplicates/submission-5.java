class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Store the last seen index of each character (initialized to -1)
        int[] lastSeen = new int[128];
        java.util.Arrays.fill(lastSeen, -1);
        
        int maxLength = 0;
        int i = 0; // Left pointer
        
        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            
            // If the character was seen inside the current window,
            // jump the left pointer to the right of the previous occurrence
            if (lastSeen[currentChar] >= i) {
                i = lastSeen[currentChar] + 1;
            }
            
            // Update the last seen position
            lastSeen[currentChar] = j;
            
            // Calculate window length
            maxLength = Math.max(maxLength, j - i + 1);
        }
        
        return maxLength;
    }
}