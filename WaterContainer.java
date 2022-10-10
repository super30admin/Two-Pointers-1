//Container With Most Water
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        //we use 2 pointers left and right
        //move pointer which has smaller height
        int left=0, right=height.length-1, maxarea=0;
        //when left and right meets then we stop
        while(left<right){
            //max of area with current pointer with min pointer height and previous maxarea
            maxarea=Math.max(Math.min(height[left],height[right]) * (right-left), maxarea);
            //move the pointer with small height
                if(height[left]<=height[right]){
                    left++;
                }
                else{
                    right--;
                }
        }
        return maxarea;
    }
}
