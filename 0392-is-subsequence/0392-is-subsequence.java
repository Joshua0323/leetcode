class Solution {
    public boolean isSubsequence(String s, String t) {

    int i = 0,j = 0;
    int tLen = t.length();
    int sLen = s.length();
        
    char arrS[] = s.toCharArray();
    char arrT[] = t.toCharArray();

    if(sLen < 1)
        return true;

    while(i<tLen){
        if(arrT[i] == arrS[j]) {
            j++;
        }
        i++;
        
    if(j == sLen)
        return true;
    }

        return false;
    }
}