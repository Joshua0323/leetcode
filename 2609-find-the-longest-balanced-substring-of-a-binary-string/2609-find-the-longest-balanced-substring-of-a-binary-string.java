class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int cnt0 = 0, cnt1 = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length();) {
            // Set the window
            // count the number of zeros
            while (i < s.length() && s.charAt(i) == '0') {
                cnt0++; i++;
            }
            // count the number of ones
            while (i < s.length() && s.charAt(i) == '1') {
                cnt1++; i++;
            }
            // Do the pairing
            maxLen = Math.max(maxLen, 2 * Math.min(cnt0, cnt1));
            // reset the values (for new pairs)
            cnt0 = cnt1 = 0;    
        }
        
        return maxLen;
    }
}