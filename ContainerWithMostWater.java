//tc=O(n)
//sc=O(1)
class Solution {
    public int maxArea(int[] h) {
        if (h == null || h.length == 0) {
            return -1;
        }
        int left = 0;
        int right = h.length - 1;
        int max=0;

        while (left < right) {
            max = Math.max(max , Math.min(h[left] , h[right]) * (right - left));
            if (h[left] < h[right]) {
                left ++;
            }
            else if (h[left] >= h[right]) {
                right--;
            }
        }
        return max;
        
    }
}