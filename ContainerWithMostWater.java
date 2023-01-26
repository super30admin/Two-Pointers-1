// Time Complexity :O(n)
// Space Complexity :O(1)

/*
 * use two pointer method from start to end get the current area.
 * Move the lower pointer in height. and update the maxarea if
 * needed. return the max area.
 */

class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;
        int currarea = 0;
        while (left < right){
            currarea = Math.min(height[left] , height[right]) * (right - left);
            if(height[left] <= height[right]) left++;
            else{
                right--;
            }
            maxarea = Math.max(maxarea, currarea);
        }
        return maxarea;
    }
}