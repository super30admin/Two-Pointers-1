// Optimized Solution
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution3 {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n-1;
        int max = Integer.MIN_VALUE+1;
        while( low < high ) {
            int wd = high - low;
            int ht = Math.min(height[high], height[low]);
            int vol = wd * ht;
            max = Math.max(max, vol);
            if( height[high] < height[low] ) {
                high--;
            } else {
                low++;
            }
        }
        return max;
    }
}

// Brute Force Solution
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Time Limit exceeded
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// class Solution {
//     public int maxArea(int[] height) {
//         int max = Integer.MIN_VALUE+1;
//         int n = height.length;
//         for(int i = 0; i < n-1; i++) {
//             for(int j = i+1; j < n; j++) {
//                 int width = j-i;
//                 int ht = Math.min(height[i], height[j]);
//                 int vol = width * ht;
//                 max = Math.max(max, vol);
//             }
//         }
//         return max;
//     }
// }