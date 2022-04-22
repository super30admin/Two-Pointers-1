//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        //base case
        if(height==null||height.length==0)
            return 0;
        //initialize maxValue and 2pointers
        int maxValue=0, l=0, r=height.length-1; 
        //iterate over the left and right pointers
        while(l<r){
            //calculate the area L*W
            maxValue=Math.max(maxValue, Math.min(height[l], height[r])*(r-l));
            //checking the left and right pointers
            if(height[l]<height[r])
                //as we check for the bigger height
                l++;
            else
                r--;
        }
        return maxValue;
    }
}