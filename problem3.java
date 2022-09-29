public class problem3 {
    public int maxArea(int[] height) {

// Time Complexity : O(n) n-> number of elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
        
        if(height == null || height.length < 2) return 0;
        
        int n = height.length;
        
        int left = 0;
        int right = n-1;
        int max = 0;
        
        while(left < right){
            max = Math.max(max, (right-left) * Math.min(height[left],height[right]));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
