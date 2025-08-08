// This solution uses a two pointer approach to come up to a max area. We move the pointer for which the height is lesser because from the lowest candle, its always the maximum area towards the last element.
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j) {
            // If both candles are same height, we calculate max and move both the pointers
            if(height[i]==height[j]) {
                max = Math.max(height[i]*(j-i), max);
                i++; j--;
            // If left candle is shorter, we calculate max and move left pointer
            } else if(height[i]<height[j]) {
                max = Math.max(height[i]*(j-i), max);
                i++;
            // If right candle is shorter, we calculate max and move right pointer
            } else {
                max = Math.max(height[j]*(j-i), max);
                j--;
            }
        }
        return max;
    }
}

