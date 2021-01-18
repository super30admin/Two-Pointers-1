// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        //edge case 
        if(height == null || height.length == 0) return 0;
        //edge case of just 2 elements
        if(height.length == 2) return Math.min(height[0],height[1]) * (height.length - 1);
        //set your pointers
        int l = 0;
        int h = height.length - 1;
        int max = Integer.MIN_VALUE;
        //while loop goes until l and h equal to iterrate through the array
        while(l != h){
            //find the min between the two pointers cause that will be the limiting factor
            int temp = Math.min(height[l], height[h]);
            //find the area and check if it is greater than global max if it is set it to be the new max
            max = Math.max(max,temp * (h-l));
            //chech which pointer to move 
            //if l is the limiting then move it up one
            if(temp == height[l]){
                l++;
            }
            //if high is limiting then move it down on
            else{
                h--;
            }
        }
        return max;
    }
}