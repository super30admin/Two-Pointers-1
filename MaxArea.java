// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class MaxArea {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = Integer.MIN_VALUE;
      
        //Two pointer from left to right and increasing start or  decreaseing end based of if the height at the postion is less or more
        while(start < end){
            maxArea = Math.max(maxArea, Math.min(height[start],height[end])*(end-start));
            if(height[start]<=height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }
}
