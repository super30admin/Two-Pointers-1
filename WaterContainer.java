/*
This approach solves the problem using two pointers. We start pointers from the lowest and highest
indices respectively, and then check the container with the most water by successively shifting
the indices from whichever height is the lowest, as the water contained is dependent on the height 
of the lowest line.

Did this code run on leetcode: Yes
*/
class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while(left < right)
        {
            max = Math.max(Math.min(height[left], height[right]) * Math.abs(left - right), max);
            
            if(height[left] <= height[right])
                left++;
            
            else if(height[left] > height[right])
                right--;
        }
        
        return max;
        
    }
}