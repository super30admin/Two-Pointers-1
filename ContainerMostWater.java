// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int max = Integer.MIN_VALUE;
        while(low<high){
            int min = Math.min(height[low], height[high]);//calculate the min between two ends
            max = Math.max(max, min*(high-low));//we want the difference between two ends for multiplication
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
}