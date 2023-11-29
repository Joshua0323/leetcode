public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
		int bit = 0;
        
		while (n != 0) {
            n &= (n - 1); // to clear the right most set bit
            ++bit;
        }
		
        return bit;
    }
}
