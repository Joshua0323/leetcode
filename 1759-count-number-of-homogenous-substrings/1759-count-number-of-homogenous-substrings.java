class Solution {
    public int countHomogenous(String s) {
        int count = 0;
        int res = 0;
        int mod = (int) 1e9 + 7;
        
        
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            
            res = (res + count) % mod; 
        }
        
        return res;
        
    }
}