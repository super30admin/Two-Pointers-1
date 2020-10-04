// Time Complexity : O(n), iterate from either side of the bars
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I didn't get time to do the problems that day hence I'm following along the lecture video

// Your code here along with comments explaining your approach
// approach in the code is to use 2 pointers one on the left, one on the right, caclulate resultant area
// to maximize the area, now move the pointer which is the less height to expect a higher height, resultant area

//brute force would have been O(n^2) try all possible combinations of bars and update max area found

class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)
            return 0;
        
        int left = 0;
        int right = height.length-1;
        int result = Integer.MIN_VALUE;
        
        while(left<right){
            result = Math.max(Math.min(height[left], height[right]) * (right-left), result);
            
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        
        return result;
    }
}