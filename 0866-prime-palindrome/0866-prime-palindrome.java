class Solution {
    public int primePalindrome(int n) {
        if(n >= 8 && n <= 11) {
            return 11;
        }

        for(int i = 1; i < 100000; i++){
            String s1 = Integer.toString(i);
            String s2 = new StringBuilder(s1).reverse().toString();

            int temp = Integer.parseInt(s1+s2.substring(1));
            if(temp >= n && isPrime(temp)) {
                return temp;
            }
        }
        return -1;
    }
    
    public boolean isPrime(int n) {
        if(n < 2 || n % 2 == 0) {
            return n == 2;
        }
        
        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}