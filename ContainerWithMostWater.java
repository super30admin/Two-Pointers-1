// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/container-with-most-water/submissions/1053409829/
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int n = height.length;
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                max = Math.max(max, Math.min(height[j],height[i]) * (j-i));
            }
        }
        return max;
    }
}
/*
 * Use the 2 pointer technique, with left at 0, right at n-1, whenever you find min depending on left/right - increment/decrement the array
 * Calculate and Update the max everytime till left crosses right
 */
class Solution1 {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        int left =0;
        int right = height.length-1;
        int max = 0;
        while(left < right){
            max = Math.max(max, Math.min(height[left], height[right]) * (right-left));
            if(height[left]<= height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}