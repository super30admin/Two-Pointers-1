/*
* BruteForce Approach: O(N^2)
* Optimal Approach: Use two pointers
* We have to return maximum amount of water so max area. area = width * height. Here for example if we take (1,8); height = min(1, 8) = 1
and width = (8 - 1) = 7 so area = 7
* If we fix the pointer at 1, no matter what we will get reduced area as there are only two possibilities and both will give us less area than what we already found;
1. height> 1 -> min(1, height),  still min height remains 1, width reduced, area reduced
2. height < 1 -> min(1, height), min height and area is reduced further
* Hence, it makes sense to move the pointer with min height in the hopes to find a bigger wall to have more area
*/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        int leftWall = 0;
        int rightWall = height.length - 1;
        int maxArea = 0;
        while(leftWall < rightWall){
            int minheight = Math.min(height[leftWall], height[rightWall]);
            maxArea = Math.max(maxArea, (rightWall - leftWall) * minheight);
            if(height[leftWall] < height[rightWall])
                leftWall++;
            else
                rightWall--;
        }
        return maxArea;
    }   
}
