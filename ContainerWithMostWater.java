/*
Two Pointers
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
*/

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length - 1;

        int maxAr = 0;

        while (lo <= hi) {
            maxAr = Math.max(maxAr, Math.min(height[lo], height[hi]) * (hi - lo));

            if (height[lo] < height[hi]) {
                lo++;
            } else {
                hi--;
            }
        }

        return maxAr;
    }
}

/*
 * Binary Search
 * 
 * Time Complexity: O(NlogN)
 * Space Complexity: O(N)
 * 
 * class Solution {
 * public int maxArea(int[] height) {
 * int n = height.length;
 * int[] increasing = new int[n];
 * int[] decreasing = new int[n];
 * 
 * increasing[0] = height[0];
 * for (int i = 1; i < n; i++) increasing[i] = Math.max(height[i],
 * increasing[i-1]);
 * 
 * decreasing[n-1] = height[n-1];
 * for (int i = n-2; i >= 0; i--) decreasing[i] = Math.max(height[i],
 * decreasing[i+1]);
 * 
 * int ans = 0;
 * for (int i = 0; i < n; i++) {
 * int l = farthestOnLeft(increasing, 0, i, height[i]);
 * int r = farthestOnRight(decreasing, i, n-1, height[i]);
 * 
 * ans = Math.max(ans, (r-l)*height[i]);
 * }
 * 
 * return ans;
 * }
 * 
 * private int farthestOnLeft(int[] arr, int low, int high, int target) {
 * if (low > high) return -1;
 * if (low == high) return low;
 * int mid = (low + high)/2;
 * 
 * if (arr[mid] >= target) return farthestOnLeft(arr, low, mid, target);
 * return farthestOnLeft(arr, mid+1, high, target);
 * }
 * 
 * private int farthestOnRight(int[] arr, int low, int high, int target) {
 * if (low > high) return -1;
 * if (low == high) return low;
 * int mid = (low + high)/2 + 1;
 * 
 * if (arr[mid] >= target) return farthestOnRight(arr, mid, high, target);
 * return farthestOnRight(arr, low, mid - 1, target);
 * }
 * }
 * 
 */

/*
 * Brute force
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 * 
 * class Solution {
 * public int maxArea(int[] height) {
 * int maxAr = Integer.MIN_VALUE;
 * for(int i =0; i < height.length; i++){
 * for(int j = i+1; j < height.length; j++){
 * maxAr = Math.max(maxAr, Math.min(height[i], height[j]) * (j-i));
 * }
 * }
 * 
 * return maxAr;
 * }
 * }
 * 
 */
