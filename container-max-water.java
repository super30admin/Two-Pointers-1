class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int max = 0;

        while (p1 < p2) {
            if (height[p1] <= height[p2]) {
                max = Math.max(max, height[p1] * (p2-p1));
                p1++;
            } else {
                max = Math.max(max, height[p2] * (p2-p1));
                p2--;
            }
        }
        return max;
    }
}

//tc: 0(logn)
//sc:O(1)