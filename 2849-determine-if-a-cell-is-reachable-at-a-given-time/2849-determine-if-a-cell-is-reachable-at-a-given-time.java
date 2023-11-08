class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int a = 0;
        boolean res = true;
        if (sx == fx && sy == fy && t == 0){
            a = t;
        }
        else if (sx == fx && sy == fy){
            a = 2;
        }
        else if (Math.abs(fx - sx) >= Math.abs(fy - sy)) {
            a = Math.abs(fx - sx);
        }
        else if (Math.abs(fx - sx) < Math.abs(fy - sy)) {
            a = Math.abs(fy - sy);
        } 

        return a <= t ? true : false;
    }
}