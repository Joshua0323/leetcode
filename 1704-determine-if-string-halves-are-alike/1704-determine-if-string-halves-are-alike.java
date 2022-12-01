class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int len = s.length()/2;
        int count = 0;
        boolean res = false;
        
        String str1 = s.substring(0, len);
        String str2 = s.substring(len, s.length());

        for (char c : arr) 
        {
            for(int i = 0; i < str1.length(); i++) {            
            if (c == str1.charAt(i)) {
                count++;
            }
            
            if (c == str2.charAt(i)) {
                count--;
            }
        }
        }
        
                
        if(count == 0) {
            res = true;
        }
                
        return res;
    }
}