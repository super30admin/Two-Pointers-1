// ## Problem3 (https://leetcode.com/problems/container-with-most-water/)

// Time Complexity : O(N), where N is the number of elements in input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Area = Height * Width
// We start from extreme ends, so width is max
// Fixing width, only way to increase area is to increase height,
// so we move the pointer with lower height

class Solution {

    // 1. Brute force: Time O(N), Space O(1)
    private int bruteForce(int[] height){
        // Generate all possible containers and find max area
        int maxArea=0;

        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int currArea=Math.min(height[i], height[j]) * (j-i);
                maxArea=Math.max(maxArea, currArea);
            }
        }

        return maxArea;
    }

    // 2. Two Pointers: Time - O(N), Space - O(1)
    private int twoPointers(int[] height){
        int len=height.length;
        int l=0;
        int r=len-1;
        int maxArea=0;

        while(l<r){
            // Contract inwards
            int currArea=Math.min(height[l], height[r])*(r-l);
            maxArea=Math.max(currArea, maxArea);

            // Move pointer with lower height
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxArea;
    }

    public int maxArea(int[] height) {
        //return bruteForce(height);
        return twoPointers(height);
    }
}