class Solution {
    public int maxArea(int[] h) {
        if(h == null || h.length == 0) {
            return 0;
        }
        int i, j, max;
        i = 0;
        j = h.length - 1;
        max = 0;
        while(i < j) {
            max = Math.max(max, Math.min(h[i], h[j]) * (j - i));
            if(h[i] < h[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}