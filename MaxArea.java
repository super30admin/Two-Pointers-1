// Time Complexity : The time complexity is O(n) where n is the length of the array.
// Space Complexity : The space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {

        int start = 0;
        int end = height.length-1;

        int max = Integer.MIN_VALUE;

        while(start < end){

            int area = (end-start)*Math.min(height[start],height[end]);
            max = Math.max(max,area);

            // Decrement the end pointer if its value is minimum
            if(height[start] > height[end]){
                end--;
            }
            // Increment the start pointer if its value is minimum
            else{
                start++;
            }

        }

        return max;

    }
}