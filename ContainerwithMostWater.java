// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        
        int max =0;
        int left = 0;
        int right = height.length -1;  
        while(left<right){
            int val = Math.min(height[left],height[right]) * (right-left);
            max = Math.max(max,val);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
