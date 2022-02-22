//Time Complexity: O(n)
//space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
    public int maxArea(int[] height) {
        
        int l=0;
        int h = height.length-1;
        int maxCapacity = 0;
        
        //iterate while low is less than high
        while(l<h) {
            //calculate current capacity between indices l,h
            int currCapacity = Math.min(height[l], height[h]) * (h-l);
            
            //update maxCapacity
            if(currCapacity > maxCapacity) {
                maxCapacity = currCapacity;
            }

            //compare heights at l and h
            if(height[l] < height[h]) {//if height at l < height at h
                //we might encounter a taller height on the l (low) side later
                l++;
            } else
                //we might encounter a taller height on the h (high) side later
                h--;
            
        }
        
        return maxCapacity;
        
    }
}