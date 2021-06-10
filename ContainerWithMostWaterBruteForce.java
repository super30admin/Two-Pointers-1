class Solution {
    public int maxArea(int[] h) {
        if(h == null || h.length == 0) {
            return 0;
        }
        int i, j, max;
        max = 0;
        for(i = 0; i < h.length; i++) {
            for(j = i + 1; j < h.length; j++) {
                max = Math.max(max, Math.min(h[i], h[j]) * (j - i));
            }
        }
        return max;
    }
}