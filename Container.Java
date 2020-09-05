// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approachclass Solution 
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }
        
        int left=0;
        int right=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        int area=1;
        while(left<right){
            if(height[left]<height[right]){
                area= height[left]*(right-left);
                left++;
                }else{
                area= height[right]*(right-left);
                right--;
            }
        maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}