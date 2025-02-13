// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// base case - if the height is less than two means there are not enough towers to capture water between.
//we will initialise two ptrs left and right such that we take min amongst the two which will determine how much water we capture, multiply it with the dist b/w the ptrs for area
// we move the ptrs accordingly

class Solution {
    public int maxArea(int[] height) {
        //base case
        if (height.length < 2 || height == null) {
            return 0;
        }
        int max = 0;
        int n = height.length;
        int l = 0; int r = n - 1;

        while (l < r) {
            int curr = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(max, curr);
            if (height[l] < height[r]) {
                l ++;
            }
            else {
                r --;
            }
        }
        return max;
    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution2 {
    public int maxArea(int[] height) {
        //base case
        if (height.length < 2 || height == null) {
            return 0;
        }

        int max = 0;
        int n = height.length;

        for (int i = 0; i < n - 1; i ++) {
            for (int j = i + 1; j < n; j ++) {
                int currAr = Math.min(height[i], height[j])*(j - i);
                max = Math.max(max, currAr);
            }
        }
        return max;
    }
}