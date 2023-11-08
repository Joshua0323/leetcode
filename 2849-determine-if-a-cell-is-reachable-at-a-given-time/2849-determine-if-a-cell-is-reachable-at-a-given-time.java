class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int a = 0;
        boolean res = true;
        int x = Math.abs(fx - sx);
        int y = Math.abs(fy - sy);
        
        if (sx == fx && sy == fy && t == 0){
            a = t;
        }
        else if (sx == fx && sy == fy){
            a = 2;
        }
        else if (x >= y) {
            a = x;
        }
        else if (x < y) {
            a = y;
        }
        
        return a <= t ? true : false;
    }
}