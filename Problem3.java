//Problem: Container with most water
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Brute Force approach: This gives time limit exceeded
// Time Complexity : O(n^2)
// Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                int currArea = Math.min(height[i], height[j]) * (j-i);
                max = Math.max(max, currArea);
            }
        }
        return max;
    }
}

//Optimized Solution: Using two pointers
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int low =0;
        int high = n -1;
        while(low < high){
            int currArr = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(max, currArr);
            if(height[low] < height[high]){
                low ++;
            }else{
                high--;
            }
        }

        return max;
    }
}