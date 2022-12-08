public class Leetcode11 {
    public int maxArea(int[] height) {

        // this is a two pointer solution:
        if (height == null || height.length < 2) {
            return 0;
        }
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        while (low < high) {
            max = Math.max(max, Math.min(height[low], height[high]) * (high - low));
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}

// brute force--> O(n^2)
// tc--> O(n)
// sc--> O(1)
// whereever we have n^2 we need to use either of:
// hashing
// two pointer
// sliding window
// binary search
