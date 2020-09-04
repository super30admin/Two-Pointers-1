// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// // Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        curArea=1
        maxim=float("-inf")
        while left<right: # left most to right most gives maximum widt
        
            if height[left]<height[right]: # go with side with higher value than previous, for higher area
                curArea=(right-left)*height[left] #calculate current area
                left+=1
            else:
                curArea=(right-left)*height[right]
                right-=1
            
            maxim=max(maxim,curArea)
        return maxim # return maximum of all areas
 
                