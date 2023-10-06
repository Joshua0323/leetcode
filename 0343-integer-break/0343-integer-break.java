class Solution {
    public int integerBreak(int n) {
        
        int max = 0;
        
        if(n == 2) {
            max = 1;
        } else if (n == 3) {
            max = 2;
        }
        
        if(n > 3) {
            if (n % 3 == 0) {
                max = (int) Math.pow(2, 0) * (int) Math.pow(3, n/3);
            } else if (n % 3 == 1) {
                max = (int) Math.pow(2, 2) * (int) Math.pow(3, n/3 - 1); 
            } else if (n % 3 == 2){
                max = (int) Math.pow(2, 1) * (int) Math.pow(3, n/3); 
            }
        }
        return max;
    }
}