// Time Complexity : O(n)), 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package twoPointer1;

public class MaxArea {
     public int maxArea(int[] height) {
        //area = height * width;
        if(height == null || height.length == 0) return 0;
        // two pointers low and high
        int left = 0, right = height.length -1;
        int max = 0;
            while(left < right){
                max = Math.max(max, Math.min(height[left],height[right]) * (right -left));
                if(height[left] < height[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
        return max;    
    }
}
