/* Time Complexity : O(n)
 * 	n - length of the input array - height */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :


//Two-pointer

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int max = Integer.MIN_VALUE;
        int n = height.length;
        int l = 0;
        int r = n - 1;

        while(l < r){
            //min of the heights - length and difference in the indexes - width
            int currArea = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(max, currArea);
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}






/* Time Complexity : O(n^2)
 * 	n - length of the input array - height */
/* Space Complexity : O(1) */

/* Brute-Force - Nested iterations

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;

        int max = Integer.MIN_VALUE;
        int n = height.length;

        for(int i = 0; i < n-1 ; i++){
            for(int j = 0; j < n; j++){
                //min of the heights - length and difference in the indexes - width
                int currArea = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, currArea);
            }
        }
        return max;
    }
}

*/