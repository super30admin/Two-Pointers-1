// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height==None or len(height)==0:
            return 0
        area=0
        left=0
        right=len(height)-1                                     
        while left<right:                              //traverse list with two pointers from left to right         
            area=max(area,(right-left)*(min(height[left],height[right])))     //computer area between left and right with min height
            if height[left]<height[right]:          //if left height is <right height =>move towards right to find greater height then current
                left+=1
            else:                           //if right height is <left height =>move towards left to find greater height then current
                right-=1
        return area
