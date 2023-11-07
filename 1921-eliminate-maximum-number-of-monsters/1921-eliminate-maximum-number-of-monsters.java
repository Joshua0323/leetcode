class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int count = 0;
        float[] waveTime = new float[dist.length];
        for (int i = 0; i < dist.length; i++) {
            waveTime[i] = (float) dist[i] / speed[i];
        }
        
        Arrays.sort(waveTime);
        
        
        for (int i = 0; i < waveTime.length; i++) {
            if (waveTime[i] > i) {
                count++;
            } else {
                break;
            }
            
        }
        
        return count;
    }
}
