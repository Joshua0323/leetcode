class Solution {
    public String reverseWords(String s) {
        String rev = "";
        
        String arr[] = s.split(" ");
        
        
        for (int i = 0; i < arr.length; i++) {
            StringBuffer sb = new StringBuffer(arr[i]);
            arr[i] = sb.reverse().toString();
            rev = rev + arr[i] + " ";
        }
        
        rev = rev.substring(0, rev.length()-1);

        return rev;
    }
}